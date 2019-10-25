#### 通过api-gateway-zuul代理访问proxy-sidecar, 而zuul-sidecar代理访问了其他异构语言服务:

 1. 将proxy-sidecar启动并注册到eureka上
 
 2. 再启动api-gateway-zuul注册到eureka上
 
 3. 通过访问http://localhost:1000/proxy-sidecar/**就能访问其他语言的服务接口
 
 4. 上面等同与访问http://localhost:8060/

#### 通过feign调用proxy-sidecar代理访问的服务:

通过proxy-sidecar/**服务名+地址就能访问