package algorithm.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TwoSumTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void twoSumTest1() {
        TwoSum agent = new TwoSum();
        int[] res = new int[]{1, 0};
        assertArrayEquals(agent.solve(new int[]{2,7,11,15}, 9), res);
    }

    @Test
    public void twoSumTest2() {
        TwoSum agent = new TwoSum();
        int[] res = new int[]{2,1};
        assertArrayEquals(agent.solve(new int[]{3,2,4}, 6), res);
    }
}
























