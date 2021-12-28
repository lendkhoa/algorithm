// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.
package algorithm;

import java.util.HashMap;

public class TwoSum {
    public TwoSum() {}

    public int[] solve(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int newTarget = target - nums[i];
            if(map.containsKey(newTarget)) {
                return new int[]{i, map.get(newTarget)};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
