package PracticeJavaTPoint.Strings;

import java.util.Scanner;
import java.lang.StringBuilder;


public class FirstLetterOfWords {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();

      String[] words = str.split(" ");
      StringBuilder sb1 = new StringBuilder();
      for(String word:words){
          sb1.append(word.charAt(0));
      }

        System.out.println(sb1);
    }
}
