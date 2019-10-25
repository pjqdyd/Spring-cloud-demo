### Spring Cloud 使用案例

### 项目依赖版本:
> SpringBoot 2.1.8.RELEASE<br>
> SpringCloud Greenwich.SR2

### 项目结构:

```
  ├─spring-cloud-eureka-server          Eureka服务注册中心(单机Eureka)
  ├─spring-cloud-provider               服务提供者模块
  ├─spring-cloud-consumer               服务消费者端模块
  ├─spring-cloud-consumer-ribbon        服务消费者端Ribbon模块(实现负载均衡)
  ├─spring-cloud-eureka-server-cluster  Eureka集群服务注册中心(高可用集群)
  ├─spring-cloud-consumer-feign         Feign服务消费者端模块(对服务实现Restful调用)
  ├─spring-cloud-consumer-hystrix       Hystrix消费者模块(对服务调用实现熔断限流)
  ├─spring-cloud-hystrix-dashboard      Hystrix Dashboard监控面板模块
  ├─spring-cloud-hystrix-turbine        Hystrix Turbine多应用监控面板模块
  ├─spring-cloud-consumer-feign-hystrix Feign-Hystrix消费者模块(对服务Restful调用并实现Hystrix熔断)
  ├─spring-cloud-api-gateway-zuul       Zuul微服务网关模块
  ├─spring-cloud-proxy-sidecar          Sidecar代理访问其他语言的异构服务
  ├─spring-cloud-config-server          远程配置服务模块
  ├─spring-cloud-config-client          远程配置客户端模块
  ├─application.yml                     测试远程配置的.yml文件
  ├─.gitignore                          .gitignore文件
  ├─README.md                           README.md文件
  └─pom.xml                             父模块pom文件
 ```