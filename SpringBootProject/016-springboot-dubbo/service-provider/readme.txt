1.在pom中添加接口项目依赖，Dubbo SpringBoot Starter依赖以及zookeeper依赖
2.在zookeeper依赖中排除重复的日志依赖
3.实现接口项目中的接口服务，使用@DubboService暴露服务
    配置interface属性和版本
4.在配置文件中配置服务名、扫描的dubbo服务包、连接zookeeper的URL
5.注意这里如果采用JDK17就报错了，改成1.8就好了