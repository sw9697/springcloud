package com.sqq.myrule;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 20:05 10 10 2021
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();//定义为随机
    }
}