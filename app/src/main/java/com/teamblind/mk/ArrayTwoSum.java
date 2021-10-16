package com.teamblind.mk;

import java.util.Arrays;

/**
 *
 * https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 *
 */

public class ArrayTwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result  = new int[2];
        boolean resultFound = false;
        int i = 0;
        while (!resultFound) {
            for (i = 0; i < nums.length; i++) {
                int temp = target - nums[i];
                for (int j = 0; j < nums.length && i != j; j++) {
                    if (temp - nums[j] == 0) {
                        result[0] = i;
                        result[1] = j;
                        resultFound = true;
                        break;
                    }
                }
                if (resultFound) break;
            }
            if (i == nums.length) break;
        }
        return result;
    }
}
