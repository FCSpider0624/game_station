package com.gamestation.demoservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Demoservice1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demoservice1Application.class, args);
    }

}
