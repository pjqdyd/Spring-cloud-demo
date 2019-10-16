package com.pjqdyd.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**   
 * @Description:  [消费者Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@RestController
public class ConsumerController {

    @Autowired
    @Qualifier("eurekaClient")
    private EurekaClient eurekaClient;

    private final RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/user/hi")
    public String hi(){
        //获取服务提供者实例
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("PROVIDER-SERVER",false);
        //获取实例的地址
        String baseUrl = instanceInfo.getHomePageUrl();
        //调用提供者实例的sayHi方法
        String s = restTemplate.getForObject(baseUrl + "/user/sayHi", String.class);
        return s;
    }

}
