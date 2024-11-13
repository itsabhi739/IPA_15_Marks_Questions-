package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class removeTheWhiteSpaces {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();

    String cleanStr = str.replaceAll("\\s","");
        System.out.println(cleanStr);

    }
}
