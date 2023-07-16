package algorithm.arrays;

import java.util.*;

public class OtherArrayProblems {
    public static boolean nonDecreasingArray(int[] arr) {
        if(arr.length <= 1) return true;
        int move = 1;
        for(int i = 0; i < arr.length - 1; i++) {
            if(move < 1 && i != arr.length - 2) return false;
            if(arr[i] <= arr[i + 1]) continue;
            if(arr[i] > arr[i + 1]) {
                // decrease 1st
                move -= 1;
            }
        }
        return move == 0 ? true : false;
    }

    // Time: O(1) - Space: O(n)
    public boolean containsDuplicateHashSet(int[] array) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i: array) {
            if(set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }

    public boolean containsDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 2) return false;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) return true;
        }
        return false;
    }

}
