package com.usian.controller;

import com.usian.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderSentinelController {
    @GetMapping("/user/getId/{id}")
    public User getId(@PathVariable("id") Long id) {
        return new User(id + 2, "provider", 78);
    }
}
