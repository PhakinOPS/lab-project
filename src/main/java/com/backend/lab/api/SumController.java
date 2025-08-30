package com.backend.lab.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SumController {

    @PostMapping("/sum")
    public int sumArray(@RequestBody(required = false) List<Integer> nums){
        if (nums == null || nums.isEmpty()) return 0;
        return nums.stream().mapToInt(Integer::intValue).sum();
    }

}
