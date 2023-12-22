package com.usian;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.usian.*"})
@SpringBootApplication
@EnableFeignClients(basePackages = "com.usian.api")
public class SentinelConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelConsumerApplication.class);
        System.out.println("server-OK");
    }
}
