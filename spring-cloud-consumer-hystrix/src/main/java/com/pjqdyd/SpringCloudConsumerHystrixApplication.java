package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**   
 * @Description:  [消费者Hystrix启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
public class SpringCloudConsumerHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerHystrixApplication.class, args);
    }

}
