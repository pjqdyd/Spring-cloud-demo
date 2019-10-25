package com.pjqdyd.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**   
 * @Description:  [Zuul在代理之前执行的过滤]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@Component
public class ZuulPreFilterConfig extends ZuulFilter {

    /**
     * 类型包含pre post router error
     * pre 代表在路由代理之前执行
     * router 代表代理的时候执行
     * error 代表出错时执行
     * post 代表在route/error执行完成后执行
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filter执行顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否使用这个过滤器
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 当前过滤器的执行
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        System.out.println("pre过滤器执行");
        return null;
    }
}
