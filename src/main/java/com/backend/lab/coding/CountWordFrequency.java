package com.backend.lab.coding;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWordFrequency {
    public static Map<String, Integer> countWordFrequency(String sentence) {
        Map<String, Integer> map = new LinkedHashMap<>();

        // แปลงเป็น lowercase และลบ punctuation
        String[] words = sentence
                .toLowerCase()
                .replaceAll("[^a-z\\s]", "") // ลบเครื่องหมายที่ไม่ใช่ตัวอักษร
                .split("\\s+"); // รองรับช่องว่างหลายช่อง

        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        //เพิ่มเติมหาคำที่มีความถี่มากที่สุด
        String mostFrequentWord = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        System.out.println("Most frequent word: " + mostFrequentWord + " (" + maxCount + " times)");

        return map;
    }

    public static void main(String[] args) {
        String input = "apple,  banana apple orange banana apple";
        System.out.println(countWordFrequency(input));
    }
}
