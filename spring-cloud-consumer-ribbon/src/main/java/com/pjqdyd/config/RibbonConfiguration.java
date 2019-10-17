package com.pjqdyd.config;

import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**   
 * @Description:  [ribbon的负载均衡配置类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@Configuration
public class RibbonConfiguration {

    /**
     * 自定义负载均衡算法规则
     * @return
     */
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }

}
