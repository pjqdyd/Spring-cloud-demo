package com.pjqdyd.feign.hystrix;

import com.pjqdyd.feign.MyFeignHystrixClient;
import org.springframework.stereotype.Component;

/**   
 * @Description:  [Feign熔断后进入的回调实现类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@Component(value = "myFeignHystrixClientFallback")
public class MyFeignHystrixClientFallback implements MyFeignHystrixClient {

    @Override
    public String sayHiByFeignImplHystrix() {
        return "sayHi出错了-来自Hystrix熔断";
    }
}
