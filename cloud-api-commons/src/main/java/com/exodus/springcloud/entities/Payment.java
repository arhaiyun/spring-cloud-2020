package com.exodus.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author arhaiyun
 * @Since 2020/3/9 13:51
 */
@Data
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }
}