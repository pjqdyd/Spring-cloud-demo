package com.pjqdyd.config;

import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**   
 * @Description:  [配置Zuul的路由规则]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

//@Configuration
public class ZuulRouterConfig {

    /**
     * 默认如果配置文件中没有配置zuul, 使用如下表达式配置
     * 则会将如服务提供者名provider-server-v1的服务
     * 映射成为http:localhost:1000/v1/provider-server/**访问
     *
     */
    //@Bean
    public PatternServiceRouteMapper serviceRouteMapper(){
        return new PatternServiceRouteMapper(
                "(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}"
        );
    }

}
