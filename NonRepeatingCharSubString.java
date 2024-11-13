package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class NonRepeatingCharSubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =scan.nextLine();

        String temp = "";
        for (int i = 0; i <str.length() ; i++) {
            if (temp.indexOf(str.charAt(i)) == -1) {
                temp = temp + str.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println(temp);
        }
    }

