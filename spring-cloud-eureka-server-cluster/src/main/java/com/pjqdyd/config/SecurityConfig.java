package com.pjqdyd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**   
 * @Description:  [安全访问配置]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //因为security默认启用了csrf检验，要在eureka-server服务端配置security的csrf检验为false，
        // eureka-client才能注册
        http.csrf().disable();
        http.authorizeRequests()   //认证请求
                .anyRequest()      //对任何请求
                .authenticated()   //都需要认证
                .and()
                .httpBasic();    //使用Spring Security提供的httpBasic登录, 开启认证
                //.formLogin();  //使用Spring Security提供的表单登录界面, 开启认证 (弃用,表单验证导致客户端服务无法注册)

    }
}
