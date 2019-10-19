package com.pjqdyd.feign;

import com.pjqdyd.feign.hystrix.MyFeignHystrixClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**   
 * @Description:  [Feign调用实现Hystrix熔断客户端, fallback熔断后的回调]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@FeignClient(name = "provider-server", fallback = MyFeignHystrixClientFallback.class)
public interface MyFeignHystrixClient {

    /**
     * 这个方法调用失败后, 会进入fallback实现类中的同名方法
     * @return
     */
    @GetMapping("/user/sayHi")
    String sayHiByFeignImplHystrix();

}
