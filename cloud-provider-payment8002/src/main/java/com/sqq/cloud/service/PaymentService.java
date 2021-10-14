package com.sqq.cloud.service;

import com.sqq.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 20:32 09 26 2021
 */
public interface PaymentService {
    Payment getPaymentById(@Param("id") Long id);

    int create(Payment payment);
}
