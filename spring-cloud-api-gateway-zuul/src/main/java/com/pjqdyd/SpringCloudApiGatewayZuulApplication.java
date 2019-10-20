package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**   
 * @Description:  [Api Gateway Zuul应用启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

//这个注解自带熔断和注册到eureka,
@EnableZuulProxy
@SpringBootApplication
public class SpringCloudApiGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApiGatewayZuulApplication.class, args);
    }

}
