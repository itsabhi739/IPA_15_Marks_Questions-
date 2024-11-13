package PracticeJavaTPoint.Strings;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;
import java.lang.Character;
import java.lang.StringBuilder;
import java.lang.Math;
import java.util.Arrays;

public class LastCharacters {
//    print the last characters of the string
//    Ignore the last character if its digit or white space
//    hello3 how are you
//    output: w e u

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] words = str.split(" ");

        for(String word:words){
            char ch = word.charAt(word.length()-1);
            if(!Character.isDigit(ch)){
                System.out.print(ch);
            }
        }

    }
}