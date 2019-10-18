package com.pjqdyd.controller;

import com.pjqdyd.feign.MyFeignClient;
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

    @GetMapping("/hi")
    public String hi(){

        String s = myFeignClient.sayHiByFeign();
        return s;
    }

}
