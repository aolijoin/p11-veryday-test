package com.usian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.usian.*"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.usian.api"})
public class ConsumerSentinelApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerSentinelApplication.class);
        System.out.println("consumer-OK");
    }
}
