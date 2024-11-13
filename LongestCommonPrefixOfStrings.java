package PracticeJavaTPoint.Strings;

public class LongestCommonPrefixOfStrings {
    public static void main(String[] args) {
        String[] words = {"Amanduleep","Amandeep","Amandu"};
        int index  =0;
        String str1 = words[0];
        String str2 = words[words.length-1];


        while(index<str1.length() && index<str2.length()){
            if(str2.charAt(index) == str1.charAt(index)){
                index++;
            }
        }

        System.out.println(str1.substring(0,index));


    }
}
