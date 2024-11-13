package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scan.nextLine();

   String string = reverseWords(str);
    System.out.println(string);
    }

    private static String reverseWords(String str) {
    String[] words = str.split(" ");
    String temp = "";
        for (int i = words.length-1; i>=0 ; i--) {
            temp= temp+words[i]+" ";
        }
        return temp;
    }
}
