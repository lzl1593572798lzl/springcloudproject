package com.lzl.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhongliang.li
 * @date 2019/7/31 16:42
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerApplication.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
