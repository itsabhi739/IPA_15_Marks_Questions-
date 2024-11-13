package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class PrintVowels {
//    take string as an input and print all vowels as it is (means caps or vice versa)
//    which is available at index 0
//    input: Hello I am a student
//    output: Iaa


    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();

       String []words = str.split(" ");
       StringBuilder sb1= new StringBuilder();
       for(String word:words){
           char ch = word.charAt(0);
           if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
               sb1.append(ch);
           } else if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
               sb1.append(ch);
           }
       }

        System.out.println(sb1);
    }
}
