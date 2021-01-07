package com.forever.service;

import com.forever.entity.CommonResult;
import com.forever.entity.Payment;

public interface PaymentService {
    CommonResult insert(Payment payment);

    CommonResult getPaymentById(Long id);

}
