package com.pjqdyd.controller;

import com.pjqdyd.feign.MyFeignHystrixClient;
import com.pjqdyd.feign.MyFeignHystrixClient2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**   
 * @Description:  [Feign-Hystrix消费者Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@RestController
public class ConsumerFeignHystrixController {

    @Resource
    private MyFeignHystrixClient myFeignHystrixClient;

    @Resource
    private MyFeignHystrixClient2 myFeignHystrixClient2;

    @GetMapping("/sayHiByFH")
    public String sayHiWithFeignAndHystrix(){
        String s = myFeignHystrixClient.sayHiByFeignImplHystrix();
        return s;
    }

    @GetMapping("/sayHiByFHF")
    public String sayHiWithFeignAndHystrixFactory(){
        String s = myFeignHystrixClient2.sayHiByFeignImplHystrix();
        return s;
    }

}
