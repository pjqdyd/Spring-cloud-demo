package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**   
 * @Description:  [消费者Feign-Hystrix启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
public class SpringCloudConsumerFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerFeignHystrixApplication.class, args);
    }

}
