package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = scan.nextLine();
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if(temp.indexOf(str.charAt(i))==-1){
                temp = temp+str.charAt(i);
            }
        }

        System.out.println(temp);
    }
}


