package com.backend.lab.coding;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // ตรวจสอบว่า มีค่า complement เป็น key ใน map หรือยัง
            // ถ้ายังไม่มีให้เก็บ nums[i] ลง map
            // ถ้ามี เอา value ของ complement มาใส่ใน arrat int และ ตำแหน่ง i ปัจจุบันของลูป
            // value คือ ตำแหน่งของตัวเลขใน array int ที่เป็น input
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solver.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
