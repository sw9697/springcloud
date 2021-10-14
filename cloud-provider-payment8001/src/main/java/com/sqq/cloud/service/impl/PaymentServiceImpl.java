package com.sqq.cloud.service.impl;

import com.sqq.cloud.dao.PaymentDao;
import com.sqq.cloud.entities.Payment;
import com.sqq.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: QinQunShi
 * @Description:
 * @Modified By:
 * @create: create in 20:33 09 26 2021
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
}
