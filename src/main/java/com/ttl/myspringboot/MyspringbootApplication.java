package com.ttl.myspringboot;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Properties;

@SpringBootApplication
@MapperScan(value = "com.ttl.myspringboot.dao")   //将项目中对应的mapper类的路径加进来就可以了
@EnableScheduling
@EnableDiscoveryClient
public class MyspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);
    }

//    //配置mybatis的分页插件pageHelper
//    @Bean
//    public PageHelper pageHelper(){
//        PageHelper pageHelper = new PageHelper();
//        Properties properties = new Properties();
//        properties.setProperty("offsetAsPageNum","true");
//        properties.setProperty("rowBoundsWithCount","true");
//        properties.setProperty("reasonable","true");
//        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
//        pageHelper.setProperties(properties);
//        return pageHelper;
//    }

}
