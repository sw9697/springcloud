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
 * @create: create in 17:21 10 10 2021
 */
@RestController
@Slf4j
public class PaymentController {
    public static final String PAYMENT_URL = "http://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo(){
        String template = restTemplate.getForObject(PAYMENT_URL + "/payment/consul", String.class);
        return template;
    }
}
