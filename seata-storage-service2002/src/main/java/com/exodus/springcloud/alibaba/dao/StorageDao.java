package com.exodus.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author arhaiyun
 * @Since 2020/4/30
 */
@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
