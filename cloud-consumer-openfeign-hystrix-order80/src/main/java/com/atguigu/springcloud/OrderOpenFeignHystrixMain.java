package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 吴文伦
 * @date 2020/3/25 17:24
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderOpenFeignHystrixMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignHystrixMain.class, args);
    }
}
