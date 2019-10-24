package com.pjqdyd.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**   
 * @Description:  [Zuul熔断后的回调]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@Component
public class MyZuulFallback implements FallbackProvider {

    @Override
    public String getRoute() {
        return "provider-server"; //对应的路由
    }

    /**
     * 响应的方法
     * @param route 对应的路由
     * @param cause 异常原因
     * @return ClientHttpResponse
     */
    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ClientHttpResponse() {
            //响应码
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.BAD_REQUEST;
            }

            //数字码
            @Override
            public int getRawStatusCode() throws IOException {
                return HttpStatus.BAD_REQUEST.value();
            }

            //错误描述
            @Override
            public String getStatusText() throws IOException {
                return HttpStatus.BAD_REQUEST.getReasonPhrase();
            }

            @Override
            public void close() {

            }

            //返回体
            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream(("出现错误:" + getRoute()).getBytes());
            }

            //响应头
            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders httpHeaders = new HttpHeaders();
                httpHeaders.setContentType(MediaType.APPLICATION_JSON);
                return httpHeaders;
            }
        };
    }
}
