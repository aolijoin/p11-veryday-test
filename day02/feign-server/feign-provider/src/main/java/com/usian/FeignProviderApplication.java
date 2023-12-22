package com.usian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.usian.*"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.usian.api")
public class FeignProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignProviderApplication.class);
        System.out.println("SERVER-OK");
    }
}
