package com.backend.lab.coding;

public class SumArray {
    public int sumArray(int[] nums){
        int res = 0;
        for (int num: nums){
            res += num;
        }
        return res;
    }

    public static void main(String[] args) {
        SumArray solver = new SumArray();
        int[] nums = {2, 7, 11, 15};
        int result = solver.sumArray(nums);
        System.out.println(result);
    }
}
