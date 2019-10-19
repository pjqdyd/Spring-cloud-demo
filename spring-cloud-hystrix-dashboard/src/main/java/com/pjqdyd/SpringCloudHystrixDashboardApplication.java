package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**   
 * @Description:  [Hystrix Dashboard面版启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableHystrixDashboard
@SpringBootApplication
public class SpringCloudHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixDashboardApplication.class, args);
    }

}
