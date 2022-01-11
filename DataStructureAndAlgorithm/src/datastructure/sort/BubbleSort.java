package datastructure.sort;

// Sort the array {5,1,6,2,4,3}
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 2, 4, 3};
        int[] res = bubbleSort(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
