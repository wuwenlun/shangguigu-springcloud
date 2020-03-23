package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 吴文伦
 * @date 2020/3/22 23:17
 */
@RestController
@Slf4j
public class OrderController {

//    public static final String PAYMENT_URL = "http://localhost:8001/";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("order/create")
    private CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL+"payment/create", payment, CommonResult.class);
    }

    @GetMapping("order/get/{id}")
    private CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL+"payment/get/"+id, CommonResult.class);
    }

}
