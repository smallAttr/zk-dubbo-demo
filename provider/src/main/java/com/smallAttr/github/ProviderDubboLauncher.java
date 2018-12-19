package com.smallAttr.github;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: chenGang
 * @Date: 2018/1/2 下午3:19
 * @Description:
 */
@SpringBootApplication
@EnableDubbo
public class ProviderDubboLauncher {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ProviderDubboLauncher.class, args);
        CoreConfiguration configuration = applicationContext.getBean(CoreConfiguration.class);
        System.out.println("dubbo configuration:" + configuration);
    }


}
