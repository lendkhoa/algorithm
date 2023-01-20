package algorithm.arrays;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ThreeSumTest {
	@Test
	public void threeSumTest1() {
		ThreeSum agent = new ThreeSum();
		int[] nums = new int[]{-1,0,1,2,-1,-4};
		List<List<Integer>> res = agent.solveWithTwoSum(nums);
		assertEquals(res.size(), 2);
		assertEquals(res.get(0), Arrays.asList(-1, -1, 2));
		assertEquals(res.get(1), Arrays.asList(-1, 0, 1));
	}

    @Test
    public void threeSumTest2() {
        ThreeSum agent = new ThreeSum();
        int[] nums = new int[]{-1,0,1,2,4,-4};
        List<List<Integer>> res = agent.solveWithTwoSum(nums);
        assertEquals(res.size(), 2);
        assertEquals(res.get(1), Arrays.asList(-1, 0, 1));
        assertEquals(res.get(0), Arrays.asList(-4, 0, 4));
	}

	@Test
	public void threeSumWithTarget1() {
		ThreeSum agent = new ThreeSum();
    int[] nums = new int[]{1, -1, 0};
    List<List<Integer>> res = agent.solveWithTwoSumTarget(nums, -1);	
		assertEquals(res.size(), 0);
	}

	@Test
	public void threeSumWithTarget2() {
		ThreeSum agent = new ThreeSum();
    int[] nums = new int[]{3,7,1,2,8,4,5};
    List<List<Integer>> res = agent.solveWithTwoSumTarget(nums, 21);	
		printListOfListInteger(res);
		assertEquals(res.size(), 0);
	}

	@Test
	public void threeSumWithTarget3() {
		ThreeSum agent = new ThreeSum();
    int[] nums = new int[]{3,7,1,2,8,4,5};
    List<List<Integer>> res = agent.solveWithTwoSumTarget(nums, 20);	
		assertEquals(res.size(), 1);
		assertEquals(res.get(0), Arrays.asList(5, 7, 8));
	}

	private void printListOfListInteger(List<List<Integer>> ls) {
		for(List<Integer> li: ls) {
			for(Integer i: li) {
				 System.out.print(i + ", ");
			}
			System.out.println("\n");
	 }
	}
}
