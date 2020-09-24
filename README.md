"# spring-cloud-start-learn" 

## 一、spring cloud简介

#### spring cloud 为开发人员提供了快速构建分布式系统的一些工具，
#### 包括配置管理、服务发现、断路器、路由、微代理、事件总线、全局锁、决策竞选、
####分布式会话等等。

#### 它运行环境简单，可以在开发人员的电脑上跑。

#### 另外说明spring cloud是基于springboot的，所以需要开发中对springboot有一定的了解.

<br />
<br />

## 二
#### 在上一篇文章，讲了服务的注册和发现。
#### 在微服务架构中，业务都会被拆分成一个独立的服务，服务与服务的通讯是基于http restful的。
#### Spring cloud有两种服务调用方式，
###### 一种是ribbon+restTemplate，
###### 另一种是feign。在这一篇文章首先讲解下基于ribbon+rest。

<br />
<br />

## ribbon简介
###### Ribbon is a client side load balancer which gives you a lot of control over the behaviour of HTTP and TCP clients. 
###### Feign already uses Ribbon, so if you are using @FeignClient then this section also applies.

—–摘自官网

###### ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon。

###### ribbon 已经默认实现了这些配置bean：

IClientConfig ribbonClientConfig: DefaultClientConfigImpl

IRule ribbonRule: ZoneAvoidanceRule

IPing ribbonPing: NoOpPing

ServerList ribbonServerList: ConfigurationBasedServerList

ServerListFilter ribbonServerListFilter: ZonePreferenceServerListFilter

ILoadBalancer ribbonLoadBalancer: ZoneAwareLoadBalancer
