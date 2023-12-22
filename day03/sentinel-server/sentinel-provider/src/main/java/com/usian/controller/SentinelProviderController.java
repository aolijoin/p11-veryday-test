package com.usian.controller;

import com.usian.pojo.User;
import com.usian.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SentinelProviderController {
    @Resource
    private UserService userService;

    @GetMapping("/user/getId/{id}")
    public User getId(@PathVariable("id") Long id) {
        return userService.getId(id);
    }

}
