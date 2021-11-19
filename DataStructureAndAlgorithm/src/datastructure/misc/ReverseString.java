package datastructure.misc;

import java.util.Scanner;

// How to reverse a String in Java?
// Given a string "123" reverse the string as "321"
public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        String result = reverseString(inputString);
        System.out.println("Reverse string is :: "+result);
        scanner.close();
    }

    private static String reverseString(String inputString) {
        StringBuilder builder = new StringBuilder();
        char [] charArr = inputString.toCharArray();
        for (int i = charArr.length-1; i >= 0; i--) {
            builder.append(charArr[i]);
        }
        return builder.toString();
    }
}
