package com.backend.lab.coding;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseString solver = new ReverseString();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        solver.reverseString(input);
        System.out.println(input);
    }
}
