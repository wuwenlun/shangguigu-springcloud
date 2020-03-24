package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 吴文伦
 * @date 2020/3/24 17:57
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule getMyRule() {
        return new RandomRule();
    }
}
