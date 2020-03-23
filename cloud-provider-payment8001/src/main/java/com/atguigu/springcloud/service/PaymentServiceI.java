package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.Payment;

/**
 * @author 吴文伦
 * @date 2020/3/22 21:31
 */
public interface PaymentServiceI {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
