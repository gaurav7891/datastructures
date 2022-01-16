package datastructure.sort;

public class SelectionSort {
    // sort the array 20,12,10,15,2
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // check the next element is minimum than first
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the minimum element to first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {20, 12, 10, 15, 2};
        int[] sortedArray = selectionSort(arr);
        printArray(sortedArray);
    }

    private static void printArray(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(" " + sortedArray[i]);
        }
    }
}
