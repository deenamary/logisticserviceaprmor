package com.example.logisticserviceaprmor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LogisticserviceaprmorApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisticserviceaprmorApplication.class, args);
    }

}
