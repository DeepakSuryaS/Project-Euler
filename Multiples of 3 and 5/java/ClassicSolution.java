/*
 * Project Euler Problem 1 - Multiples of 3 and 5 solution in java.
 * This is a classic solution AKA bruteforce.
 */

public class ClassicSolution {
  private static int bruteforce(int m, int n, int limit) {
    var min = Math.min(m, n);
    var sum = 0;
    for(var x = min; x < limit; x++) {
      if(x % m == 0 || x % n == 0) {
        sum += x;
      }
    }
    return sum;
  }

  public static void main(String... args) {
    System.out.println(bruteforce(3, 5, 1000));
  }
}
