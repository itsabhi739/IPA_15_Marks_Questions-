package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class LargestWordinString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scan.nextLine();
        String[] words = str.split(" ");
        String largestWord = "";

        for(String word:words){
            if(word.length()>largestWord.length()){
                largestWord = word;
            }
        }

        System.out.println(largestWord);
    }
}
