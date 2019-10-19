package com.pjqdyd.controller;

import com.pjqdyd.feign.MyFeignClient;
import com.pjqdyd.feign.MyFeignClientByUrl;
import com.pjqdyd.feign.MyFeignClientWithLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**   
 * @Description:  [消费者Feign的Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@RestController
public class ConsumerFeignController {

    @Autowired
    private MyFeignClient myFeignClient;

    @Autowired
    private MyFeignClientByUrl myFeignClientByUrl;

    @Autowired
    private MyFeignClientWithLog myFeignClientWithLog;

    @GetMapping("/hi")
    public String hi(){
        String s = myFeignClient.sayHiByFeign();
        return s;
    }

    @GetMapping("/hiByName")
    public String hiByName(){
        String s = myFeignClient.sayHiByFeignAndName("小明");
        return s;
    }

    @GetMapping("/hiByUrl")
    public String hiByUrl(){
        String s = myFeignClientByUrl.sayHi();
        return s;
    }

    @GetMapping("/getServiceInfo")
    public String getServiceInfo(){
        String s = myFeignClientByUrl.getServiceInfo();
        return s;
    }

    @GetMapping("/hiWithLog")
    public String hiWithLog(){
        String s = myFeignClientWithLog.sayHiByFeign();
        return s;
    }

}
