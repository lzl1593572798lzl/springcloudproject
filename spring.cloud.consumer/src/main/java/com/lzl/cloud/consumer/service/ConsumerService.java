package com.lzl.cloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhongliang.li
 * @date 2019/7/31 21:47
 **/
@Service
@FeignClient(name = "ConsumerService")
public interface ConsumerService {

    /**
     * 测试feign方法
     * @param value
     * @return
     */
    @GetMapping("/feign/test")
    ResponseEntity<?> feignTest(@RequestParam("value")String value);
}
