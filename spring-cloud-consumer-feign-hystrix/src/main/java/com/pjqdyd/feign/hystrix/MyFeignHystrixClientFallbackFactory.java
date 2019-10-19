package com.pjqdyd.feign.hystrix;

import com.pjqdyd.feign.MyFeignHystrixClient2;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**   
 * @Description:  [Feign熔断后进入的回调工厂实现类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@Component(value = "myFeignHystrixClientFallbackFactory")
public class MyFeignHystrixClientFallbackFactory implements FallbackFactory<MyFeignHystrixClient2> {

    @Override
    public MyFeignHystrixClient2 create(Throwable throwable) {
        return new MyFeignHystrixClient2() {
            @Override
            public String sayHiByFeignImplHystrix() {
                return "sayHi出错了-来自Hystrix-Factory熔断";
            }
        };
    }
}
