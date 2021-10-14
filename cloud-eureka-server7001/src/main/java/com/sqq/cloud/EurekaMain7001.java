package com.sqq.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 21:26 09 27 2021
 */
@SpringBootApplication
@EnableEurekaServer
//我是eureka的注册服务中心
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
