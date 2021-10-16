package com.teamblind.mk;

import java.util.Arrays;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */

public class ArrayDuplicateValue {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean isFound = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j < i + 2; j++) {
                if (nums[i] == nums[j]) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) break;
        }
        return isFound;
    }
}
