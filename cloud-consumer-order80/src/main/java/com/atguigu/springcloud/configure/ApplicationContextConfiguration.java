package com.atguigu.springcloud.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 吴文伦
 * @date 2020/3/22 23:21
 */
@Configuration
public class ApplicationContextConfiguration {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
