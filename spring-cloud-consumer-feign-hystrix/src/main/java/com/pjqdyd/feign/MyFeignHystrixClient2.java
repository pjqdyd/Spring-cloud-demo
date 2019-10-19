package com.pjqdyd.feign;

import com.pjqdyd.feign.hystrix.MyFeignHystrixClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**   
 * @Description:  [Feign调用实现Hystrix熔断客户端, fallbackFactory熔断后的回调工厂类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@FeignClient(name = "null", url = "http://localhost:8001", fallbackFactory = MyFeignHystrixClientFallbackFactory.class)
public interface MyFeignHystrixClient2 {

    /**
     * 这个方法调用失败后, 会进入fallbackFactory实现类中的对象的同名方法
     * @return
     */
    @GetMapping("/user/sayHi")
    String sayHiByFeignImplHystrix();

}
