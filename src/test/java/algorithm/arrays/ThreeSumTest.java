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
}
