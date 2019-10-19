package com.pjqdyd.feign;

import com.pjqdyd.config.FeignClientConfig;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**   
 * @Description:  [Feign的接口]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@FeignClient(name = "provider-server", configuration = FeignClientConfig.class)
public interface MyFeignClient {

    //使用Feign完成对服务的restful风格的调用(没有指定Feign配置类时有效)
    //@GetMapping("/user/sayHi")
    //String sayHiByFeign();

    //使用Feign完成对服务的restful风格的调用
    @RequestLine("GET /user/sayHi")
    String sayHiByFeign();

    //使用Feign完成对服务的restful风格的调用(指定请求方法和参数)
    @RequestLine("GET /user/sayHiByName/{name}")
    String sayHiByFeignAndName(@Param("name") String name);

}
