package com.backend.lab.coding;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // array int ขนาดเท่ากับ 26index แต่ละตำแหน่งของ index แทนตำแหน่งตัวอีกษร เช่น a = 0
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // บวก count ในตำแหน่งของตัวอักษร เช่่น ตัวอักษร a ก็จะเพิ่มค่า count ที่ตำแหน่ง index = 0 ทีละ1
            count[s.charAt(i) - 'a']++;  // บวกสำหรับ s
            // ลบ count ในตำแหน่งของตัวอักษร เช่่น ตัวอักษร a ก็จะลบค่า count ที่ตำแหน่ง index = 0 ทีละ1
            count[t.charAt(i) - 'a']--;  // ลบสำหรับ t
        }

        // ถ้ามีตำแหน่งไหนไม่เท่ากับ 0 แปลว่ามีตัวอักษรใน string s หรือ t ที่ไม่ตรงกัน แต่ length() เท่ากัน
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram solver = new ValidAnagram();
        System.out.println(solver.isAnagram("anagram", "nagaram")); // true
        System.out.println(solver.isAnagram("rat", "car"));         // false
    }
}
