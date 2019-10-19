package com.pjqdyd.feign;

import com.pjqdyd.config.FeignClientSecurityConfig;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**   
 * @Description:  [Feign的接口, 通过url调用服务, 并使用安全认证配置]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@FeignClient(url = "http://localhost:8100", name = "null", configuration = FeignClientSecurityConfig.class)
public interface MyFeignClientByUrl {

    @RequestLine("GET /user/sayHi")
    String sayHi();

    // 测试可以调用需要认证的方法url
    //Eureka服务地址http://localhost:10000/eureka/apps/PROVIDER-SERVER是一个需要认证的接口,
    @RequestLine("GET /eureka/apps/PROVIDER-SERVER")
    String getServiceInfo();

}
