package com.sqq.cloud.controller;

import com.sqq.cloud.entities.CommonResult;
import com.sqq.cloud.entities.Payment;
import com.sqq.cloud.services.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 15:17 10 11 2021
 */
@RestController
public class OpenFeignOrderController {
    @Resource
    private PaymentFeignService paymentFeignService;
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        System.out.println("*********");
        return paymentFeignService.paymentFeignTimeout();
    }
}
