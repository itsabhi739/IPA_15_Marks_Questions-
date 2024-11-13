package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the :character : ");
        char character = scan.next().charAt(0);

        if(character =='a'||character =='e'||character =='i'||character =='o'||character =='u'){
            System.out.println("the character "+character+" is a vowel");
        } else if (character =='A'||character =='E'||character =='I'||character =='O'||character =='U') {
            System.out.println("the character "+character+"is a vowel");
        }
        else{
            System.out.println("the character "+character+" is not a vowel");
            }

    }
}
