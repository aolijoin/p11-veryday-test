package com.usian.controller;

import com.sun.webkit.LoadListenerClient;
import com.usian.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerRibbonController {
    @Resource
    private RestTemplate restTemplate;


    @GetMapping("getId/{id}")
    public User getId(@PathVariable("id") Long id) {
        return restTemplate.getForObject("http://provider/getId/" + id, User.class);
    }

}
