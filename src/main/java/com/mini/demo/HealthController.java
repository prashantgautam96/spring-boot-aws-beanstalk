package com.mini.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/get-health")
    public String getHealth() {
        return "Yes, Im happy, congratulations!";
    }
}
