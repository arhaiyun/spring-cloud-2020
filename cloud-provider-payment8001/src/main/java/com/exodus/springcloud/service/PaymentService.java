package com.exodus.springcloud.service;

import com.exodus.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author arhaiyun
 * @Since 2020/3/9 12:00
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
