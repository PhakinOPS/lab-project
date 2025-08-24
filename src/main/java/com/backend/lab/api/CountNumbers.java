package com.backend.lab.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

@RestController
public class CountNumbers {

    @PostMapping("/countnumbers")
    public LinkedHashMap<Integer,Integer> countNumber(@RequestBody ArrayList<Integer> nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        // แปลง map เป็น Set<Map.Entry<Key, value>> เพื่อเข้าถึง key และ value พร้อมกัน
        return map.entrySet()
                // แปลงเป็น Stream เพื่อใช้งาน filter/ sorted/ collect/ map
                .stream()
                // เรียงลำดับข้อมูลด้วย comparator ที่เรากำหนดเอง e1 กับ e2 เพื่อเปรียบเทียบระหว่างกัน ค่าของ e1, e2 มาจาก map
                .sorted((e1, e2) -> {
                    // เปรียบเทียบ value ว่าค่าไหนน้อยกว่ากัน เพื่อเรียงลำดับจากน้อยไปมาก
                    int cmp = Integer.compare(e1.getValue(), e2.getValue());
                    // ถ้า value เท่ากัน ก็เทียบค่าจาก key แทน
                    if (cmp == 0) {
                        return Integer.compare(e1.getKey(), e2.getKey()); // ถ้าจำนวนเท่ากัน ค่ามากไปน้อย
                    }
                    return cmp;
                })
                // หลังจาก sorted ข้อมูลครบแล้วก็ทำการเก็บค่าเข้า LinkedHashMap ที่ประกาศมาใหม่เพื่อเก็บลำดับการ put ข้อมูล
                .collect(LinkedHashMap::new,
                        (m, e) -> m.put(e.getKey(), e.getValue()),
                        LinkedHashMap::putAll);
    }
}
