package com.usian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.usian.*"})
@SpringBootApplication
public class SentinelProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelProviderApplication.class, args);
        System.out.println("启动成功");
    }
}
