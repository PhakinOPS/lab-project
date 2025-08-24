package com.backend.lab.coding;

public class ReverseSmallString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        while (left < right){
            // สร้าง temp มาเก็บค่าแรก s[left] เพราะค่าแรกจะถูกแทนที่ด้วยค่าสุดท้าย เลยต้องสร้างตัวแปรมาเก็บไว้ก่อน
            // ให้ค่าแรก s[left] เท่ากับค่าสุดท้าย s[right]
            // ให้ค่าสุดท้าย s[right] เท่ากับ temp
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // ขยับตำแหน่งเริ่มต้นขึ้น และ ตำแหน่งสุดท้ายลงเพื่อนเลื่อนลำดับที่ต้องการสลับตำแหน่ง
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseSmallString solver = new ReverseSmallString();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        solver.reverseString(input);
        System.out.println(input);
    }
}
