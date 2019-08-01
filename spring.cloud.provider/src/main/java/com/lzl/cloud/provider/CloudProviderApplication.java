package com.lzl.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhongliang.li
 * @date 2019/7/31 16:30
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderApplication.class, args);
    }
}
