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
				lo += 1;
				hi -= 1;
				// skip duplicate
				while (lo < hi && nums[lo] == nums[lo - 1])
					++lo;
			}
		}
	}

	/**
	 * Solve for triplets that add up to a target number
	 * @param nums the array of numbers
	 * @param target the target number
	 */
	public List<List<Integer>> solveWithTwoSumTarget(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> ls = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			// if the current value is the same as the one before it, skip
			if (i == 0 || nums[i - 1] != nums[i]) {
				twoSumWithTarget(nums, i, ls, target);
			}
		}
		return ls;
	}

	private void twoSumWithTarget(int[] nums, int index, List<List<Integer>> ls, int target) {
		int low = index + 1;
		int hi = nums.length - 1;
		while(low < hi) {
			int sum = nums[index] + nums[low] + nums[hi];
			if(sum < target) {
				low++;
			} else if(sum > target) {
				hi--;
			} else {
				ls.add(Arrays.asList(nums[index], nums[low], nums[hi]));
				low++;
				hi--;
				while(low < hi && nums[low] == nums[low - 1])
					low++;
			}
		}
	}
}
