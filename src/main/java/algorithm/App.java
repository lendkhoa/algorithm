package algorithm;
//import algorithm.arrays.ThreeSum;
//import algorithm.arrays.OtherArrayProblems;
//import algorithm.lib.Deque;
//import algorithm.twoPointers.ReverseWords;
//import algorithm.lib.GuideToCompetitiveProgramming;


/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args )
    {
    }

    private static boolean isPrime(int primeCheckNumber) {
        int remainder = primeCheckNumber;
        if(primeCheckNumber == 1 || primeCheckNumber == 0) {
            return false;
        } else {
            int number = remainder - 1;
            while(remainder != 0 && number > 1) {
                remainder = primeCheckNumber % number;
                number -= 1;
            }
            if(number == 1 && remainder > 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
