package com.exodus.springcloud.alibaba.service;

import com.exodus.springcloud.entities.CommonResult;
import com.exodus.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author arhaiyun
 * @Since 2020/4/30
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult< Payment > paymentSQL(@PathVariable("id") Long id);

}
