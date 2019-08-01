package com.lzl.cloud.provider.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongliang.li
 * @date 2019/7/31 21:55
 **/
@RestController
@RequestMapping("/feign")
public class FeignController {

    @GetMapping("/test")
    public ResponseEntity<?> feignTest(@RequestParam("value") String value) {
        return new ResponseEntity<>("FeignController: "+value, HttpStatus.OK);
    }

}
