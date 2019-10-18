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
  ├─spring-cloud-consumer-feign         Feign服务消费者端模块
  ├─.gitignore                          .gitignore文件
  ├─README.md                           README.md文件
  └─pom.xml                             父模块pom文件
 ```