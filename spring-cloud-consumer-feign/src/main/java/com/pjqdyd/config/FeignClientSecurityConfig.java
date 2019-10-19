package com.pjqdyd.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**   
 * @Description:  [FeignClient的安全验证配置类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@Configuration
public class FeignClientSecurityConfig {

    /**
     * 用于配置认证的Bean, (即方便feign调用SpringSecurity开启了httpBasic认证的url方法)
     * @return
     */
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("admin", "123456");
    }

}
