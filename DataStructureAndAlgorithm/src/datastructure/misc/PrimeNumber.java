package datastructure.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// check if the given number is Prime
public class PrimeNumber {

    public static void main(String[] args) {
        int num = 100;
        System.out.println(isPrime(num));
        List<Integer> primeNumbers = findPrimeNumbers(num);
        for (Integer i : primeNumbers){
            System.out.print(i+",");
        }
    }

    private static boolean isPrime(int num) {

        if (num == 0 || num == 1) return false;
        if (num == 2) return true;

        for (int i = 2; i <=num/2 ; i++) {
            if (num % i ==0){
                return false;
            }
        }
        return true;
    }

    // Sieve of Eratosthenes algorithm
    /**
     * The algorithm to find prime numbers between 1 and N has the following steps.
     *
     * Create a list of consecutive numbers from 2 to N i.e. (2,3,4…N).
     * Start with the first and the smallest prime number 2. Let’s say variable p=2.
     * Find the multiples of p i.e. 2p, 3p, 4p up to N and mark them in the list as not prime numbers. Note that the number p should not be marked itself.
     * Find the next number in the list that is not marked and follow the earlier step with it.
     * When the numbers in the list are exhausted, the algorithm is terminated. The list of numbers that are not marked are the prime numbers between 1 and N.
     * @param n
     * @return list of prime numbers in the given number
     */
    private static List<Integer> findPrimeNumbers(int n){
        // initialize the array with "true", index denotes the numbers from 0 to n.
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        // loop from 2 to x until x*x becomes greater than n
        for (int i = 0; i*i < n ; i++) {
            // process if the number is not already marked
            if (primes[i]){
                // find the multiples and mark them as false
                for (int j = i*i; j <= n; j++) {
                    primes[j] = false;
                }
            }
        }

        // populate the list of prime numbers from array and return it
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primes[i]) primeNumbers.add(i);
        }
        return primeNumbers;
    }
}
