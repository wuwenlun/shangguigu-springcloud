package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.PaymentOpenfeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 吴文伦
 * @date 2020/3/24 21:32
 */
@RestController
@Slf4j
public class OrderOpenfeignController {

    @Autowired
    private PaymentOpenfeignService paymentOpenfeignService;

    @GetMapping("consumer/payment/get/{id}")
    private CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentOpenfeignService.getPaymentById(id);
    }

}
