package algorithm.dynamicProgramming;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n)
 */
public class FibonacciNumber {

	public static int perform(int n) {
		int i = 0; // 1 1
		int j = 1; // 1 2
		int res = 0; // 1, 2, 3
		// n = 3, 2, 1
		// F(3) = F(2) + F(1) = 1 + 1 = 2
		while(n > 1) {
			res = i + j;
			i = j;
			j = res;
			n -= 1;
		}
		return res;
	}
}
