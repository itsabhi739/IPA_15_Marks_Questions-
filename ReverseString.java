package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
//        take the input
        Scanner scan  = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = scan.nextLine();


//        reverse a long string
        String[] words  = str.split(" ");
        String reverseWords="";
        for (String word:words){
                String rev = "";
            for (int i = word.length()-1; i >= 0; i--) {
                rev = rev+word.charAt(i);
            }
            reverseWords = reverseWords+rev+" ";
        }

        System.out.println(reverseWords);
    }
}
