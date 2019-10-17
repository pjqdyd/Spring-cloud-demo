package com.pjqdyd;

import com.pjqdyd.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**   
 * @Description:  [消费者客户端Ribbon启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

//启用Ribbon并对PROVIDER-SERVER进行负载均衡
@RibbonClient(name = "PROVIDER-SERVER", configuration = RibbonConfiguration.class)
@EnableEurekaClient
@SpringBootApplication
//避免ribbon的配置类被扫描到
@ComponentScan(basePackages = "com.pjqdyd", excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = RibbonConfiguration.class)})
public class SpringCloudConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerRibbonApplication.class, args);
    }

}
