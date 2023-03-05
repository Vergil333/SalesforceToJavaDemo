package com.martinmachava.manualsfjavademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(
//    scanBasePackages = {"com.martinmachava.manualsfjavademo"},
    scanBasePackages = {"com.martinmachava"}
//    scanBasePackageClasses = {SalesforceComponent.class}
)
public class ManualSfJavaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManualSfJavaDemoApplication.class, args);
    }
}