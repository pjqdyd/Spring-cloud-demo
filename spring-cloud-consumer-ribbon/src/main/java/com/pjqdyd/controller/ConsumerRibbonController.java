package com.pjqdyd.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**   
 * @Description:  [消费者Ribbon客户端controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@RestController
public class ConsumerRibbonController {

    @Autowired
    @Qualifier(value = "eurekaClient")
    private EurekaClient eurekaClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/user/hi")
    public String sayHi(){
        String s = restTemplate.getForObject("http://PROVIDER-SERVER/user/sayhi", String.class);
        return s;
    }

    /**
     * 测试客户端的负载均衡
     * @return
     */
    @GetMapping("/testLoadBalance")
    public String testLoadBalance(){
        //查找对应服务的实例, 会通过负载均衡去查找
        ServiceInstance serviceInstance = loadBalancerClient.choose("PROVIDER-SERVER");

        String serviceInfo = serviceInstance.getServiceId() + serviceInstance.getHost() + ":" +serviceInstance.getPort();
        System.out.println(serviceInfo);
        return serviceInfo;
    }

}
