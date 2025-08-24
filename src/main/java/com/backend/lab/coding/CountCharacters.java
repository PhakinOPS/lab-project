package com.backend.lab.coding;

import java.util.HashMap;

public class CountCharacters {
    public void countCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        // array int แทนจำนวนตัวอักษรภาษาอังกฤษทั้งหมด 26 ตัวอักษร
        //int[] count = new int[26];

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            // count[s.charAt(i) - 'a']++ เพิ่มค่าที่ตำแหน่งของตัวอักษร เช่น ถ้าเป็นตัวอักษร a ตำแหน่งที่ count[0] ก็จะบวกเพิ่ม 1 ค่า ทุกครั้งที่เจอตัวอีกษร a
            //map.put(s.charAt(i), ++count[s.charAt(i) - 'a']);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        CountCharacters solver = new CountCharacters();
        solver.countCharacter("anagram");
    }
}
