package PracticeJavaTPoint.Strings;

import java.util.Scanner;

//here we have to repeat the
//input: CHNKSC
// output: CSK

public class CSKQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String temp = "";
        if(str.contains("CHN")){
        for (int i = str.length()-1; i >= 3; i--) {
            temp = temp+str.charAt(i);
        }
        }

        System.out.println(temp);

    }
}
