package com.forever.controller;

import com.forever.entity.CommonResult;
import com.forever.entity.Payment;
import com.forever.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @PackageName:com.forever.controller
 * @ClassName:PaymentController
 * @Description:
 * @Author: zqc
 * @date 2021/1/7 16:25
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/insert")
    public CommonResult insert(Payment payment){

        return paymentService.insert(payment);
    }

    @GetMapping("/getPayment/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){

        return paymentService.getPaymentById(id);
    }
}
