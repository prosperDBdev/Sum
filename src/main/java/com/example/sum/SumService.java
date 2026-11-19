package com.example.sum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class SumService {

    public int sum(int a, int b) {
        return a + b;
    }
}
