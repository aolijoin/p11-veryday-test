package com.usian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.usian.*")
public class ProviderRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderRibbonApplication.class);
        System.out.println("provider-OK");
    }
}
