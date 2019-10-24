package com.pjqdyd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**   
 * @Description:  [Zull的安全配置]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@Configuration
public class ZuulSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().permitAll() //测试时先允许访问
                //.anyRequest().authenticated()
                //.and()
                //.httpBasic()	//开启httpBasic认证
                .and()
                .csrf().disable();
    }
}
