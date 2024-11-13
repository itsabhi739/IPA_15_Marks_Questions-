package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class CheckSmallAlphabets {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scan.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
            if(ch>=97 && ch<=122){
                count++;
            }
        }

        System.out.println(count);
    }
}
