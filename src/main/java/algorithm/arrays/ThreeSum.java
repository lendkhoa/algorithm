package algorithm.arrays;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j],
 * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
 * nums[k] == 0.
 * 
 * 1 ex-1: [-1,0,1,2,-1,-4] --> : [[-1,-1,2],[-1,0,1]]
 * 
 */

public class ThreeSum {
	public ThreeSum() {
	}

	public List<List<Integer>> solveWithTwoSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ls = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			// if the current value is the same as the one before it, skip
			if (i == 0 || nums[i - 1] != nums[i]) {
				twoSum(nums, i, ls);
			}
		}
		return ls;
	}

	private void twoSum(int[] nums, int index, List<List<Integer>> ls) {
		int lo = index + 1;
		int hi = nums.length - 1;
		while (lo < hi) {
			int sum = nums[index] + nums[lo] + nums[hi];
			if (sum < 0) {
				lo += 1;
			} else if (sum > 0) {
				hi -= 1;
			} else {
				ls.add(Arrays.asList(nums[index], nums[lo], nums[hi]));
				// skip duplicate
				while (lo < hi && nums[lo] == nums[lo - 1])
					++lo;
			}
		}
	}
}
