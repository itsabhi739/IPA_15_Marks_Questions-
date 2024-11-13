package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class SpacesandCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = scan.nextLine();

        int spaceCount = 0;
        int charCount = 0;
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' '){
                spaceCount++;
            }
            else{
                charCount++;
            }
        }

        System.out.println("the number of space are : "+spaceCount+" and character count is : "+charCount);
    }
}
