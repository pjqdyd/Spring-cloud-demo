package com.pjqdyd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**   
 * @Description:  [用户Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@RestController
public class UserController {

    @GetMapping("/user/sayHi")
    public String sayHi(){
        return "Hello!";
    }

}
