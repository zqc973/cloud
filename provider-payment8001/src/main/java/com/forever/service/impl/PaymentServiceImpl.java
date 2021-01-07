package com.forever.service.impl;

import com.forever.entity.CommonResult;
import com.forever.entity.Payment;
import com.forever.mapper.PaymentMapper;
import com.forever.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * @PackageName:com.forever.service.impl
 * @ClassName:PaymentServiceImpl
 * @Description:
 * @Author: zqc
 * @date 2021/1/7 16:21
 */
@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public CommonResult insert(Payment payment) {
        int result = paymentMapper.insert(payment);

        log.info("*******插入结果{}", result);

        CommonResult commonResult;

        if (result > 0) {
            return new CommonResult(HttpStatus.OK.value(), "添加成功", result);
        }

        return new CommonResult(444, "添加失败", null);
    }

    @Override
    public CommonResult getPaymentById(Long id) {
        Payment payment = paymentMapper.getPaymentById(id);

        log.info("*******查询结果{}", payment);

        if (payment != null) {
            return new CommonResult(HttpStatus.OK.value(), "查询成功", payment);
        }
        return new CommonResult(444, "无对应记录，查询ID:"+id, null);
    }
}
