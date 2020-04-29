package com.exodus.springcloud.service.impl;

import com.exodus.springcloud.dao.PaymentDao;
import com.exodus.springcloud.entities.Payment;
import com.exodus.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author EiletXie
 * @Since 2020/3/9 12:02
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
