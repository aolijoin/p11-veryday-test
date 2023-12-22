package com.usian.controller;

import com.usian.pojo.User;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ProviderController {
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/getId/{id}", method = RequestMethod.GET)
    public User getId(@PathVariable("id") Long id) {
        ServiceInstance consumer = loadBalancerClient.choose("consumer");
        String url = "http://" + consumer.getHost() + ':' + consumer.getPort() + "/getId/" + id;
        return restTemplate.getForObject(url, User.class);
    }


}
