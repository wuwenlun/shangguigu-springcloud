package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author 吴文伦
 * @date 2020/3/22 21:34
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("payment/zk")
    private String paymentzk() {
        return "spring cloud with zookeeper: "+serverPort+"\t"+ UUID.randomUUID();
    }
}
