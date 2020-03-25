package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author 吴文伦
 * @date 2020/3/25 22:25
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_ok(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_ok";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_Timeout";
    }
}
