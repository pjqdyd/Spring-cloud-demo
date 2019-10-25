package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**   
 * @Description:  [SpringCloud Config客户端]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
//@EnableDiscoveryClient //引入并开启了eureka的话就要这个注解
@SpringBootApplication
public class SpringCloudConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientApplication.class, args);
    }

}
