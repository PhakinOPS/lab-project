package com.backend.lab.coding;

public class ReverseWords {

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");

        int left = 0;
        int right = words.length - 1;

        while (left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String output = reverseWords(input);

        System.out.println("Input: "+input);
        System.out.println("Output: "+output);
    }
}
