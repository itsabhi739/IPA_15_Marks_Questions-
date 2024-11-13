package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class RemoveTheCharacter {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
       String ch = scan.nextLine();


       String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.contains(ch)){
                 newStr = str.replaceAll(ch,"");
            }
        }
        System.out.println(newStr);
    }
}
