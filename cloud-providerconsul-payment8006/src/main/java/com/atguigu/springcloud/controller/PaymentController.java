package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 吴文伦
 * @date 2020/3/24 16:21
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("payment/consul")
    private String paymentconsul() {
        return "spring cloud with consul: "+serverPort+"\t"+ UUID.randomUUID();
    }
}
