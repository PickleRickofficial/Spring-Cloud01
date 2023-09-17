package com.rick.eruekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient     //开启发现服务功能
@SpringBootApplication
public class Cloud01EruekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cloud01EruekaConsumerApplication.class, args);
    }


    @LoadBalanced       //开启负载均衡机制
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
