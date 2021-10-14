package com.sqq.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 17:10 10 12 2021
 */
@Component
public class PaymentFallbackService implements OrderHystrixService{
    @Override
    public String payment_OK(Integer id) {
        return "---------PaymentFallbackService fall back-payment_OK,/(ㄒoㄒ)/~~";
    }

    @Override
    //    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    public String payment_Timeout(Integer id) {
        return "---------PaymentFallbackService fall back-payment_Timeout,/(ㄒoㄒ)/~~";
    }
}
