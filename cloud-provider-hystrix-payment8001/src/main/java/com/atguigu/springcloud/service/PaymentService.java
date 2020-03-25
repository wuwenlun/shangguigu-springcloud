package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author 吴文伦
 * @date 2020/3/25 0:18
 */
@Service
public class PaymentService {

    public String paymentInfo_ok(Integer id) {
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_ok,id:"+id;
    }

    /**
     * 运行异常或者超时异常都会进入兜底方法
     * @param id
     * @return
     * @throws InterruptedException
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value="3000")
    })
    public String paymentInfo_Timeout(Integer id) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_Timeout,id:"+id;
    }

    public String paymentInfo_TimeoutHandler(Integer id) {
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_TimeoutHandler,id:"+id;
    }
}
