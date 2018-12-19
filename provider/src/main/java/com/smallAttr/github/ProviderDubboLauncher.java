package com.smallAttr.github;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: chenGang
 * @Date: 2018/1/2 下午3:19
 * @Description:
 */
@SpringBootApplication
@EnableDubbo
public class ProviderDubboLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDubboLauncher.class,args);
    }


}
