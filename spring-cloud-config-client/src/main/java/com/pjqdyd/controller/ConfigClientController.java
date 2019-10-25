package com.pjqdyd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @Value("${user-info.username}")
    private String userName;

    /**
     * 测试本应用是否成功加载到github的配置
     * @return
     */
    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return profile + "-" +userName;
    }

}
