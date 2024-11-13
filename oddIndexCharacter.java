package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class oddIndexCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scan.nextLine();

        char[] arr = str.toCharArray();
        for (int i = 1; i < arr.length;i=i+2) {
            System.out.print(arr[i]+" ");
        }
    }
}
