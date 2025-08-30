package com.backend.lab.coding;

import java.util.*;

public class ThreeSum {

    public static List<int[]> threeSum(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    result.add(new int[]{nums[i], nums[left], nums[right]});
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, -1, 0, -2, 1};
        int target = 0;
        List<int[]> triplets = threeSum(nums, target);

        for (int[] triplet : triplets) {
            System.out.println(Arrays.toString(triplet));
        }
    }
}
