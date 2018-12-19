package com.smallAttr.github;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Author: chenGang
 * Date: 2018/12/19 2:36 PM
 */
@Data
@ConfigurationProperties(prefix = "dubbo.registry")
@Configuration
public class CoreConfiguration {

    private String address;

    private String client;
}
