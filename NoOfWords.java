package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class NoOfWords {
    public static void main(String[] args) {
//        take the input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scan.nextLine();
        String[] words =str.split(" ");
        int count=0;
        for(String word:words){
            count++;
        }

        System.out.println(count);

    }
}
