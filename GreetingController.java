package com.example.komalsfirst.experiment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/")
    public String getgreeting() {
         return "im komal";
    }
}
