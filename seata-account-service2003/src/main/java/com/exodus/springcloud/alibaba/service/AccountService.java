package com.exodus.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * @Author arhaiyun
 * @Since 2020/4/30
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);
}
