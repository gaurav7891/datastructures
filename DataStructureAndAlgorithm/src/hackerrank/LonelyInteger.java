package hackerrank;

import java.util.*;
//Given an array of integers, where all elements but one occur twice, find the unique element.
//e.g arr = [1 2 3 4 3 2 1]
// unique is 4
public class LonelyInteger {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> list) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer x : list) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1){
                return e.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(lonelyinteger(list));

        scanner.close();
    }
}
