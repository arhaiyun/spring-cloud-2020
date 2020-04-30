package com.exodus.springcloud.alibaba.service;

import com.exodus.springcloud.alibaba.domain.Order;

/**
 * @Author arhaiyun
 * @Since 2020/4/30
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}