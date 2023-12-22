package com.usian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.usian.*"})
@EnableDiscoveryClient
public class ProviderSentinelApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderSentinelApplication.class);
        System.out.println("provider-OK");
    }
}
