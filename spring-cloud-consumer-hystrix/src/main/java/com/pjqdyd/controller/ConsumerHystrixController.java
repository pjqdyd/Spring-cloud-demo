package com.pjqdyd.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**   
 * @Description:  [Hystrix消费者Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@RestController
public class ConsumerHystrixController {

    @Autowired
    @Qualifier("eurekaClient")
    private EurekaClient eurekaClient;

    private final RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/user/hi")
    @HystrixCommand(fallbackMethod = "errorInfo")
    public String hi(){
        //获取服务提供者实例
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("PROVIDER-SERVER",false);
        //获取实例的地址
        String baseUrl = instanceInfo.getHomePageUrl();
        //调用提供者实例的sayHi方法
        String s = restTemplate.getForObject(baseUrl + "/user/sayHi", String.class);
        return s;
    }

    /**
     * 熔断之后的返回方法 (参数要和调用的方法一致)
     * @return
     */
    public String errorInfo(){
        return "出错了-(来自Hystrix熔断)";
    }

}
