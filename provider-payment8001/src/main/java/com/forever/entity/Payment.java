package com.forever.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @PackageName:com.forever.entity
 * @ClassName:Payment
 * @Description:
 * @Author: zqc
 * @date 2021/1/7 14:19
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
