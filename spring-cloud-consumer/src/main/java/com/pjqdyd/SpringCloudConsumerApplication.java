package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**   
 * @Description:  [消费者启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerApplication.class, args);
    }

}
