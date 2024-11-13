package PracticeJavaTPoint.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1= scan.nextLine();
        String str2 = scan.nextLine();

        if(isAnagram(str1,str2)){
            System.out.println("the strings are Anagram");
        }
        else {
            System.out.println("the strings are not Anagram");
        }

    }

    private static boolean isAnagram(String str1, String str2) {
       if(str1.length() != str2.length()){
           return false;
       }
       char[] arr = str1.toCharArray();
       char[] arr2 = str2.toCharArray();

       Arrays.sort(arr);
       Arrays.sort(arr2);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }


}
