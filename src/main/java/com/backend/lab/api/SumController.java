package com.backend.lab.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SumController {

    @PostMapping("/sum")
    public int sumArray(@RequestBody List<Integer> nums){
        int res = 0;

        for(int num: nums){
            res += num;
        }

        return res;
    }
}
