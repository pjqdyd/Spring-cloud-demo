package com.pjqdyd.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**   
 * @Description:  [HystrixDashboard配置, 注册/actuator/hystrix.stream节点使能被HystrixDashboard监控到]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@Configuration
public class HystrixDashboardConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }


}
