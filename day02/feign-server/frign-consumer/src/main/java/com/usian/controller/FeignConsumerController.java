package com.usian.controller;

import com.usian.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {

    @RequestMapping(value ="/getId/{id}",method = RequestMethod.GET)
    public User getId(@PathVariable("id") Long id){
        return new User(id,"Feign",99);
    }
}
