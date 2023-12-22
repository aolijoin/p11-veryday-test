package com.usian.api;

import com.usian.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("feign-consumer")
public interface UserFeign {
    @RequestMapping(value ="/getId/{id}",method = RequestMethod.GET)
    public User getId(@PathVariable("id") Long id);
}
