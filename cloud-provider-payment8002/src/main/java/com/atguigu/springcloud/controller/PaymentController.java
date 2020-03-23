package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.atguigu.springcloud.service.PaymentServiceI;

/**
 * @author 吴文伦
 * @date 2020/3/22 21:34
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentServiceI paymentServiceI;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("payment/create")
    private CommonResult<Payment> create(@RequestBody Payment payment) {
        int id = paymentServiceI.create(payment);
        if(id > 0) {
            return new CommonResult<Payment>(200, "创建成功，端口："+serverPort, payment);
        } else {
            return new CommonResult<Payment>(400, "创建失败，端口："+serverPort);
        }
    }

    @GetMapping("payment/get/{id}")
    private CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentServiceI.getPaymentById(id);
        log.info("******获取结果："+payment);
        if(payment != null) {
            return new CommonResult<Payment>(200, "查询成功，端口："+serverPort, payment);
        } else {
            return new CommonResult<Payment>(400, "没有对应记录，id:"+id+"，端口："+serverPort);
        }
    }
}
