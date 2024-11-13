package PracticeJavaTPoint.Strings;

import java.util.Scanner;

//Abhijeet
//Abhijt
public class FirstNonRepeatedChar {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str= scanner.nextLine();
      String temp = "";

        for (int i = 0; i < str.length(); i++) {
            boolean u = true;
            for (int j = 0; j < str.length(); j++) {
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    u = false;
                }
            }
            if(u){
                temp = temp+str.charAt(i);
            }
        }

        System.out.println(temp);
    }
}
