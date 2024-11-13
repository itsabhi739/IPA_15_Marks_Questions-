package PracticeJavaTPoint.Strings;

import java.util.Scanner;
import java.lang.StringBuffer;

public class RemoveRepeatedValues {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = scan.nextLine();

//        to store the string
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    unique  = false;
                }
            }
            if(unique){
                sb1.append(str.charAt(i));
            }
        }
        System.out.println(sb1);
    }}

