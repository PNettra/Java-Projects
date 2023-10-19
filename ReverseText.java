package javaapplication171;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseText {

    // method to reverse the input
    public static String reverseTextWord(String textToReverse) {

        char[] newWord = new char[textToReverse.length()]; // reverses the text

        for (int i = 0, j = textToReverse.length() - 1; i < textToReverse.length(); i++, j--) {
            newWord[j] = textToReverse.charAt(i);
        }

        return new String(newWord); // returns reversed text

    }

    // method to maintain order of words
    public static String reverseText(String str) {

        String newText = "";
        String[] words = str.split(" ");

        for (String s : words) {
            newText += reverseTextWord(s) + " ";
        }

        return newText;

    }

    // DO NOT MODIFY main!
    // main defines the text as input from the user, then prints out the reversed text
    public static void main(String[] args) {

        String S = "";
        for (int i=0; i < args.length; i++){
            S = S + args[i] + " ";
        }

        System.out.println(reverseText(S));

    }

}