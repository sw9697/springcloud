package com.sqq.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 20:57 10 11 2021
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
public interface OrderHystrixService {
    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String payment_OK(@PathVariable("id") Integer id);

    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String payment_Timeout(@PathVariable("id") Integer id);
}
