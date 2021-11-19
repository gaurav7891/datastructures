package datastructure.misc;

//  Java Program to check if a vowel is present in the string?
public class CheckVowelInString {

    public static void main(String[] args) {
        String s = "TV";
        System.out.println(checkVowel(s));
    }

    private static boolean checkVowel(String s) {
        char[] charArr = s.toLowerCase().toCharArray();
        for (char c : charArr) {
            if (c == 'a' || c == 'e' ||
                    c == 'i' || c == 'o' ||
                    c == 'u') {
                return true;
            }
        }
        return false;
    }
}
