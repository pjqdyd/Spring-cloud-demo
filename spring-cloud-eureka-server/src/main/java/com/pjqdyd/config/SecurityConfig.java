package com.pjqdyd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**   
 * @Description:  [安全访问配置]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //因为security默认启用了csrf检验，要在eureka-server服务端配置security的csrf检验为false，
        // eureka-client才能注册
        http.csrf().disable()
                .httpBasic();//开启认证
    }
}
