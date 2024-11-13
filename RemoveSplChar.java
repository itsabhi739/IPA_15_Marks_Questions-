package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class RemoveSplChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

       String cleanStr = string.replaceAll("[^a-zA-Z]","");
        System.out.println(cleanStr);
    }
}
