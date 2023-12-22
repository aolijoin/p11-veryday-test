package com.usian.controller;

import com.usian.api.UserFeign;
import com.usian.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignProviderController {
    @Resource
    private UserFeign userFeign;

    @RequestMapping(value ="/getId/{id}",method = RequestMethod.GET)
    public User getId(@PathVariable("id") Long id){
        return userFeign.getId(id);
    }

}
