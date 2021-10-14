package com.sqq.cloud.config;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 16:00 10 11 2021
 */

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}