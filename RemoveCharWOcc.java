package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class RemoveCharWOcc {
    //    remove the character with the occurrences in a string
    public static void main(String[] args) {
//        APPLE
//        A12LE

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);
        String temp = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
                temp =temp+count;
            }
            else{
                temp = temp+str.charAt(i);
            }
        }
        System.out.println(temp);
    }
}