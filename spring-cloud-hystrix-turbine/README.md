 #### 如何启动:
 
 1. 启动eureka注册中心
 
 2. 启动consumer-client-hystrix,consumer-client-hystrix2这两个服务集群
 
 3. 启动hystrix-turbine本应用
 
 4. 再启动hystrix dashboard应用
 
 5. 访问http://localhost:20000/hystrix, 输出要监控的流http://localhost:20001/turbine.stream
 
 6. 即可监控集群, 同样需要访问一下两个服务的接口才有监控数据


注意: 如果被监控的应用配置了context-path, 如下:
```
 server:
   port: 9000
   context-path: /myRootPath

 eureka:
   instance:
     prefer-ip-address: true
     home-page-url-path: /myRootPath
```

则需要在本配置中加上: turbine.instanceUrlSuffix.CONSUMER-CLIENT-HYSTRIX: /myRootPath/hystrix.stream


或者被监控的应用直接如下配置, (把暴露信息的端口配置成9011,就不需考虑context-path了):
```
 server:
   port: 9000
   context-path: /myRootPath

 eureka:
   instance:
     prefer-ip-address: true
     home-page-url-path: /myRootPath
     metadata-map:
       management.port: 9011

 management:
   port: 9011
```