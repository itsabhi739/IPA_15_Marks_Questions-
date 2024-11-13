package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class StringinAlphabetOrder {
    public static void main(String[] args) {
//        taking the input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scan.nextLine();

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        String string = new String(arr);
        System.out.println(string);
    }
}
