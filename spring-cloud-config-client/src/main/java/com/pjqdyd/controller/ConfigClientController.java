package com.pjqdyd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //开启刷新配置(默认不刷新,需要手动刷新)
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
