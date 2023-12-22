package com.usian.service.impl;

import com.usian.pojo.User;
import com.usian.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getId(Long id) {
        System.out.println("执行一次");
        return new User(id + 1, "Tom", 18);
    }
}
