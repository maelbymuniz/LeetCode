package com.mmuniz.leetcode.easy;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        //int nums[] = {2,7,11,15};
        //int target = 9;
        //int nums[] = {3,2,4};
        //target = 6;
        //int nums[] = {3, 2, 3};
        //int target = 6;
        int nums[] = {0,4,3,0};
        int target = 0;

        TwoSumSolution.twoSum(nums, target);

    }
}
class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> positions = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (positions.containsKey(diff)) {
                return new int[] {positions.get(diff), i};
            }
            positions.put(nums[i],i);
        }
        return new int[]{};

        /**
         * My first Resolution with 60 / 61 testcases passed
         * int positions[] = new int[2];
        int sum = -1;

        if (sum != target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    int auxSum = nums[i] + nums[j];
                    if (auxSum == target) {
                        positions[0] = i;
                        positions[1] = j;
                    }
                }
            }
        }
        for (int i = 0; i < positions.length; i++) {
            if (i == 0) {
                System.out.print("[" + positions[i] + ",");
            } else if (i < positions.length - 1) {
                System.out.print(positions[i] + ",");
            } else if (i <= positions.length) {
                System.out.print(positions[i] + "]");
            }
        }
        return positions;
        **/
    }
}
