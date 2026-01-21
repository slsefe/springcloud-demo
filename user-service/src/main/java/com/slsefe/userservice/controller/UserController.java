package com.slsefe.userservice.controller;

import com.alibaba.cloud.nacos.annotation.NacosConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserController {
    @Value("${plainKey}")
    String testKey;

    @NacosConfig(dataId = "user-service", group = "DEFAULT_GROUP", key = "rate")
    String rate;

    @RequestMapping("/testPlainKey")
    public String test() {
        return testKey;
    }

    @RequestMapping("/rate")
    public String rate() {
        return rate;
    }

}
