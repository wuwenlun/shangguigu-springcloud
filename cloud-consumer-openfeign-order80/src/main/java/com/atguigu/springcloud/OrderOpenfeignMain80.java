package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 吴文伦
 * @date 2020/3/24 19:09
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenfeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenfeignMain80.class, args);
    }
}
