package com.sqq.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 22:11 10 08 2021
 */
@RestController
@Slf4j
public class ZkController {
    public static final String PAYMENT_URL = "http://cloud-provider-payment8004";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        String template = restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
        return template;
    }
}
