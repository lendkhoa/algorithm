package algorithm;
import algorithm.arrays.ThreeSum;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        ThreeSum agent = new ThreeSum();
        agent.solves(new int[]{-1,0,1,2,-1,-4});
        System.out.println( "Hello World!" );
    }
}
