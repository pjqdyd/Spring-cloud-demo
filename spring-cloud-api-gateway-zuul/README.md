
#### 几种zuul的配置方式:

1. 默认不配置就是以http://localhost:1000/ [服务名] /**的方式访问接口;

2. 访问http://localhost:1000/actuator/routes可以查看zuul的路由规则;

```
zuul:
  #配置路由映射
  routes:
    provider-server: /ps/** #给指定服务provider-server添加映射地址为/ps
  #ignored-services: provider-server #取消zuul代理的服务
```

```
zuul:
  routes:
    adcdef: #随便写, 但保证唯一
      path: /ps/**
      serviceId: provider-server
```

```
zuul:
  #(此种方式会没有负载均衡和熔断)
  routes:
    adcdef: #随便写, 但保证唯一
      path: /ps/**
      url: http://localhost:9000/
```

```
zuul:
  routes:
    adcdef: #随便写, 但保证唯一
      path: /ps/**
      serviceId: provider-server
ribbon:
  eureka:
    enabled: false #在eureka中禁用ribbon负载均衡
provider-server: #对上面的服务指定ribbon负载均衡
  ribbon: 
    listOfServers: http://localhist:9000/,http://localhoost:9001/
```

```
zuul:
  #前缀路由配置
  prefix: /abc
  #忽略映射的路由
  ignoredPatterns: /**/admin/**
  routes:
    #用户服务通过/myusers/来访问
    users:
      path: /myusers/**
    #其他服务都通过/来访问
    legacy:
      path: /**
    
```

```
#zuul代理了上传文件的接口, 防超时
hystrix.command.default.exection.isolation.thread.timeoutInMilliseconds: 60000
ribbon:
  ConnectTimeout: 3000
  ReadTimeout: 60000
```