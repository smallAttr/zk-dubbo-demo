package com.smallAttr.github;

import com.smallAttr.github.service.impl.ConsumerDubboServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: chenGang
 * @Date: 2018/1/2 下午3:32
 * @Description:
 */
@SpringBootApplication
public class ConsumerDubboLauncher {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConsumerDubboLauncher.class, args);
        ConsumerDubboServiceImpl consumerDubboService = context.getBean(ConsumerDubboServiceImpl.class);
        consumerDubboService.print();
    }
}
