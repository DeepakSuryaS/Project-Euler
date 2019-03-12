/*
 * Project Euler Problem 2 - Even Fibonacci Numbers
 * Solution in Java
 */

public class ClassicSolution {
  public static void main(String args[]) {
    int sum = 0, a = 0, b = 1, count = 0;
    int c = a + b;
    while(c < 4000000) {
      if(c % 2 == 0) {
        sum = sum + c;
	count++;
      }
      a = b;
      b = c;
      c = a + b;
    }
    System.out.println("There are " + count + " even fibonacci numbers less than 4,000,000.");
    System.out.println("Sum of all the even fibonacci numbers less than 4,000,000 is " + sum + ".");
  }
}
