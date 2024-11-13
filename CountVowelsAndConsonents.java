package PracticeJavaTPoint.Strings;

import java.util.Scanner;

public class CountVowelsAndConsonents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int countConsonants = 0;
        int countVowels = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
                countVowels++;
            }
            else if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                countVowels++;
            }
            else if (ch == ' '){
                continue;
            }
            else{
                countConsonants++;
            }
        }

        System.out.println(countConsonants);
        System.out.println(countVowels);

        }
}
