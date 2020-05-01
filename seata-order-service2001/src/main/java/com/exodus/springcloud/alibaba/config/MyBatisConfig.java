package com.exodus.springcloud.alibaba.config;


import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author arhaiyun
 * @Since 2020/4/30
 */
@Configuration
@MapperScan({"com.arhaiyun.springcloud.alibaba.dao"})
public class MyBatisConfig {

}
