package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class FindOddCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 1; i <str.length(); i=i+2) {
            System.out.print(str.charAt(i));
        }
    }
}
