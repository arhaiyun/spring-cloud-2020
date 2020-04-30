package com.exodus.springcloud.alibaba.service;


/**
 * @Author arhaiyun
 * @Since 2020/4/30
 */
public interface StorageService {

    void decrease(Long productId, Integer count);

}
