package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**   
 * @Description:  [消费者客户端Ribbon启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

//启用Ribbon并对PROVIDER-SERVER进行负载均衡
@RibbonClient("PROVIDER-SERVER")
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerRibbonApplication.class, args);
    }

}
