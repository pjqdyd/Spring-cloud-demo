package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**   
 * @Description:  [Zuul Sidecar启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableSidecar
@SpringBootApplication
public class SpringCloudProxySidecarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProxySidecarApplication.class, args);
    }

}
