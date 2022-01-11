package datastructure.misc;

public class Palindrome {

    public static void main(String[] args) {
        String s = "Oyos";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        char [] charArr = s.toLowerCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = charArr.length-1; i >=0; i--) {
            stringBuilder.append(charArr[i]);
        }
        String newString = stringBuilder.toString();
        return newString.equals(s.toLowerCase());
    }
}
