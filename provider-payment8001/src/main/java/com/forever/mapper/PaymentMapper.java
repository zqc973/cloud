package com.forever.mapper;

import com.forever.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @PackageName:com.forever.mapper
 * @ClassName:PaymentMapper
 * @Description:
 * @Author: zqc
 * @date 2021/1/7 15:36
 */
@Mapper
public interface PaymentMapper {
    int insert(Payment payment);

    Payment getPaymentById(Long id);


}
