package com.debrup.microservicesapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesApiGatewayApplication.class, args);
    }

}
