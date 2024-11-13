package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class PrintSpaces {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int countSpaces = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == ' '){
                countSpaces++;
            }
        }
        System.out.println(countSpaces);
    }
}
