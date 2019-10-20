package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**   
 * @Description:  [Hystrix Turbine多应用监控启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableTurbine
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudHystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixTurbineApplication.class, args);
    }

}
