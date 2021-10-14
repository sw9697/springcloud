package com.sqq.cloud.dao;

import com.sqq.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 19:19 09 26 2021
 */
@Mapper
public interface PaymentDao {
    Payment getPaymentById(@Param("id") Long id);

    int create(Payment payment);
}
