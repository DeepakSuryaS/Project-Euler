/*
 * Project Euler Problem 3 - Largest Prime Factor solution in java.
 */

/* 
 * Bruteforce is not the right method to follow.
 * Since the given number is very large, bruteforce would take a long time to calculate the answer.
 * So, we will determine if the given number is divisible by more than numbers (1 and itself).
 * If it is, then the number is not a prime number.
 * We can find the largest prime factor using this technique.
 */

import java.util.Set; 
import java.util.HashSet;


public class Solution {
  
  //finding all the factors
  private static Set<Long> factors (long number) {
    Set<Long> factor = new HashSet<>();
    long sqrt = (long) Math.sqrt(number);
    for(long x = 2; x <= sqrt; x++) {
      if(number % x == 0)
        factor.add(x);
    }

    int currSize = factor.size();
    for(int x = 0; x < currSize; x++) {
      factor.add(number / factor.iterator().next());
    }

    factor.add(number);
    return factor;
  }

  //finding the largest factor
  public static long largestPrime(long number) {
    Set<Long> factor = factors(number);
    long largest = 0;
    for(long fact : factor) {
      int counter = 0;
      for(long divisor = 1; divisor <= fact; divisor++) {
        if(fact % divisor == 0) counter++;
        if(counter > 1 && divisor < fact) break;
        if(divisor == fact) largest = Math.max(largest, fact);
      }
    }
    return largest;
  }

  public static void main(String... args) {
    System.out.println(largestPrime(600851475143L));
  }
}


/* 
 * We are using Sets to store the answers, because sets don't hold duplicates.
 * First we determine the sqrt of the given number.
 * Then we try to divide it by x which starts from 2 (because 2 is the smallest prime).
 * If x can divide the given number, it will be added to the Set named factor.
 * Now we have all the divisors of the sqrt of the given number, which means we have the lower of the divisors of the given number. We need to find the upper half of the divisors so that we can determine the largest of them all.
 * To do that, we will divide the number by all of the elements that were added to the set called factor and the add the quotient to the set called factor.
 * For example, if we are given the number 16. sqrt(16) is 4. Using the first for loop, we will get 1, 2, and 4, which are the lower half of the divisors of 16. To find the upper half, we use the second for loop which divides the number by elements of the set called factor and adds the quotients to the set called factor. (i.e. 16/1 = 16, 16/2 = 8, 16/4 = 4).
 * Now we have all of the divisors of the number.
 * Out of all the factors, we determine the largest factor using the largestPrime method.
 * We create a Set called factor again to store all the factors returned by the factors method.
 * We also set the value of the variable called largest to 0 initially.
 * Then, we iterate through the factors in the set called factor using the for-each loop.
 * Increment the counter everytime the divisor and fact(dividend) return a reminder of 0.
 * If count increases to more than 1 even before the divisor becomes equal to the fact, we break the loop.
 * After that, if the loop is not yet broken and divisor == factor, we go ahead and determine the largest.
 * Determine the largest using the max method.
 */

/* I have mentioned "set called factor" too many times just for understanding purposes. Peace! */