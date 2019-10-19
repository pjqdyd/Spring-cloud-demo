package com.pjqdyd.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**   
 * @Description:  [FeignClient配置类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@Configuration
public class FeignClientConfig {

    //feign的默认契约
    @Bean
    public Contract feignContract(){
        return new Contract.Default();
    }

}
