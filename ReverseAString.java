package PracticeJavaTPoint.Strings;

import java.util.Scanner;
import java.lang.StringBuffer;

public class ReverseAString {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String str = scan.nextLine();
     String temp = "";
        for (int i = str.length()-1; i>=0 ; i--) {
            temp =temp+str.charAt(i);
        }

        System.out.println(temp);
 }
}
