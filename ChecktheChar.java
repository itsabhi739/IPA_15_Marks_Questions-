package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class ChecktheChar{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                System.out.println(ch+" is present at "+i);
            }
        }
    }
}