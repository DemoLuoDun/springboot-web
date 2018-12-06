# springboot-web
springboot-web项目

一：集成框架
    1.集成springcload
        Spring Cloud专注于为典型用例提供良好的开箱即用体验，并为其他用户提供可扩展性机制。
        分布式/版本化配置
        服务注册和发现
        路由
        服务到服务电话
        负载均衡
        断路器
        全球锁
        领导选举和集群国家
        分布式消息
        子项目：
        Spring Cloud Config
        由git存储库支持的集中式外部配置管理。配置资源直接映射到Spring，Environment但如果需要，可以由非Spring应用程序使用。
        Spring Cloud Netflix
        与各种Netflix OSS组件集成（Eureka，Hystrix，Zuul，Archaius等）。
        Spring Cloud Bus


**springboot集成mybatis：**
           一：mapper版
                    1.配置几个属性：
                    mybatis:
                      # 指定全局配置文件位置
                      config-location: classpath:mybatis/mybatis-config.xml
                      # 指定sql映射文件位置
                      mapper-locations: classpath:mybatis/mapper/*.xml
                      #指定实体类路径
                      type-aliases-package: com.best.bean
                    2.指定mapperw位置或者单个mapper上加上注解
                       @MapperScan(value = "com.best.dao") OR   @Mapper
           二：注解版
                    使用@select,@update,@insert,@delete等注解
                    
**springboot集成JPA：**
            1.编写实体类和表进行对象关系映射
            2.编写Dao集成JpaRepository(JPA提供的操作类)
            
            
**springboot集成springbatch**         
             1.介绍：  
                    轻量级，全面的批处理框架，旨在开发对企业系统日常运营至关重要的强大批处理应用程序。
                    Spring Batch提供了可重复使用的功能，这些功能对于处理大量记录至关重要，
                    包括记录/跟踪，事务管理，作业处理统计，作业重启，跳过和资源管理。它还提供更高级的技术服务和功能，
                    通过优化和分区技术实现极高容量和高性能的批处理作业。简单和复杂的大批量批处理作业可以高度可扩展的
                    方式利用框架来处理大量信息。
             2.功能：
                    交易管理
                    基于块的处理
                    声明性I / O.
                    启动/停止/重新启动
                    重试/跳过
                    基于Web的管理界面（Spring Cloud Data Flow）
            


QPS:
    1.内置tomcat不能与外置tomcat同时存在， <scope>provided</scope>
	<dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-tomcat</artifactId>
        <scope>provided</scope>
    </dependency>
    
    
    springboot 相关组件博客地址
    2.https://blog.csdn.net/forezp/article/details/70148833/