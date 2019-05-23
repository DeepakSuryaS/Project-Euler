import java.lang.Math;

public class Solution {
    private static long reversed(long number) { //method to reverse the number
        long reversed = 0; //keeps track of the reversed number
	long reduced; //keeps track of the last digit of the number

	while(number > 0) {
	    reduced = number % 10; //gets the last digit
	    reversed = (reversed * 10) + reduced; //reverses the number
	    number /= 10;
	}

	return reversed;
    }

    private static boolean isPalindrome(long number) { //checks if the number is palindrome
        return reversed(number) == number;
    }

    private static long largestPalindrome(long a, long b) {
        long result = 0;
	long largest = 0;
	for(long x = a; x > 99; x--) {
	    for(long y = b; y > 99; y--) {
	        result = y * x;
		if(isPalindrome(result)) {
		    largest = Math.max(largest, result);
		}
	    }
	}

	return largest;
    }

    public static void main(String... args) {
        System.out.println(largestPalindrome(999, 999));
    }
}

/*
 * two largest three digit numbers will be passed through the largestPalindrome method where those will be assigned to x and y respectively
 * after that, with the help of two for loops we calculate the products of the two numbers while decrementing the numbers for every iteration
 * x and y values are checked to be greater than 99 because we need to check the result of only 3 digit numbers, so it will be efficient if we don't have to
 * calculate the product and check if it is a palindrome for numbers less than 99.
 * we then pass the result of the product through the isPalindrome method.
 *
 *
 * then we write a method to reverse the number.
 * we can do this either by converting the number to a string and reversing or just reversing the number itself
 * then we pass the number to the isPalindrome method to check if it is a palindrome.
 *
 * */
