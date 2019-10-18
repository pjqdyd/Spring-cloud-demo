package com.pjqdyd.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**   
 * @Description:  [Feign的接口]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@FeignClient("provider-server")
public interface MyFeignClient {

    //使用Feign完成对服务的restful风格的调用
    @GetMapping("/user/sayHi")
   String sayHiByFeign();

}
