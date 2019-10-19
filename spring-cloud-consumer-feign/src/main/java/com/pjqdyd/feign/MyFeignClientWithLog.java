package com.pjqdyd.feign;

import com.pjqdyd.config.FeignClientLoggerConfig;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**   
 * @Description:  [FeignClient配置日志]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@FeignClient(url = "http://localhost:8001", name = "testlog", configuration = FeignClientLoggerConfig.class)
public interface MyFeignClientWithLog {

    @RequestLine("GET /user/sayHi")
    String sayHiByFeign();

}
