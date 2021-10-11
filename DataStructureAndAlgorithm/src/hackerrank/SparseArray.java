package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * There is a collection of input strings and a collection of query strings.
 * For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.
 *
 * e.g
 * strings = [ab, ab, abc]
 * queries = [ab, abc, bc]
 * There are 2 instances of ab, 1 of abc and 0 of bc so the result is [2,1,0]
 */
public class SparseArray {


    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        List<Integer> result = new ArrayList<>();

        for (int k = 0; k < queries.size(); k++) {
            int count = matchingString(strings, queries.get(k));
            result.add(count);
        }

        return result;
    }

    private static int matchingString(List<String> strings, String s) {
        int count = 0;
        for (String str : strings) {
            if (str.equals(s)){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            strings.add(scanner.next());
        }
        int q = scanner.nextInt();
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(scanner.next());
        }
        scanner.close();
        List<Integer> res = matchingStrings(strings, queries);

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

    }
}
