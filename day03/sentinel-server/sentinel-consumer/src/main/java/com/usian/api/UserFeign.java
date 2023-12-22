package com.usian.api;

import com.usian.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("provider")
public interface UserFeign {

    @GetMapping("/user/getId/{id}")
    public User getId(@PathVariable("id") Long id);

}
