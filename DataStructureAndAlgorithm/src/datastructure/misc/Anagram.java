package datastructure.misc;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "post";
        String s2 = "stop";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)){
            System.out.println("Given strings "+s1+" and "+s2+" are anagrams");
        }else {
            System.out.println("Given strings are not anagrams");
        }
    }
}
