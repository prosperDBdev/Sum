package com.example.sum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SumController {

    SumService sumService;

    @Autowired
    public SumController(SumService sumService) {
        this.sumService = sumService;
    }

    @GetMapping("/sum")
    public String sum(@RequestParam("a")int a, @RequestParam("b") int b) {
        int result = sumService.sum(a,b);
        return "The sum of " + a + " and " + b + " is: " + result;
    }
}
