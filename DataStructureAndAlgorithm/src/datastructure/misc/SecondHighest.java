package datastructure.misc;

// Find second largest number in an array?
// There are many ways to solve this problem.
// We can sort the array in natural ascending order
// and take the second last value. But, sorting is an expensive operation.
public class SecondHighest {

    public static int findSecondLargest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        System.out.println("highest:: "+highest+"secondLargest:: "+secondLargest);
        for (int i : array) {
            if (i > highest) {
                secondLargest = highest;
                highest = i;
            } else if (i > secondLargest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int []arr = {100,2,3,4,235,-26};

        int second = findSecondLargest(arr);
        System.out.println(second);
    }
}
