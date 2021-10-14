package com.sqq.cloud.services;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 16:41 10 11 2021
 */
public interface PaymentService {
    String paymentInfo_OK(Integer id);
    String paymentInfo_Timeout(Integer id);
    String paymentCircuitBreaker(Integer id);
}
