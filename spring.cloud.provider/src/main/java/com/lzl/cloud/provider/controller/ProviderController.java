package com.lzl.cloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongliang.li
 * @date 2019/7/31 16:39
 **/
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/test")
    public String providerTest(@RequestParam("value")String value){
        return "一切安好便是晴天_"+value;
    }

}

