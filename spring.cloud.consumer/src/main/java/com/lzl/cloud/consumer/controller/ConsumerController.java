package com.lzl.cloud.consumer.controller;

import com.lzl.cloud.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhongliang.li
 * @date 2019/7/31 16:48
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/test")
    public String consumerTest(@RequestParam("value") String value) {
        return restTemplate.getForObject("http://cloud-provider/provider/test?value=" + value, String.class);
    }

    @GetMapping("/feign")
    public ResponseEntity<?> feignTest(@RequestParam("value") String value){
        return consumerService.feignTest(value);
    }


}
