package com.sdsoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


//@EnableConfigurationProperties({DruidProperties.class})
//@ComponentScan("com.sdsoon.demo.*")
@SpringBootApplication
public class ConDubboApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        //1
        SpringApplication.run(ConDubboApplication.class, args);

        //2
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
//        ConfigurableApplicationContext run = SpringApplication.run(ConDubboApplication.class, args);
//        OrderService orderService = run.getBean(OrderService.class);
//        orderService.queryOrder();
    }

    @Override//为了打包springboot项目
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

}
