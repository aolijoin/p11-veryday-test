package com.usian.controller;

import com.usian.api.UserFeignApi;
import com.usian.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerSentinelController {
    @Resource
    private UserFeignApi userFeignApi;

    @GetMapping("/user/getId/{id}")
    public User getId(@PathVariable("id") Long id) {
        return userFeignApi.getId(id);
    }

}
