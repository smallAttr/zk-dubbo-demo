package com.smallAttr.github.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.smallAttr.github.constants.Constants;
import com.smallAttr.github.domain.User;
import com.smallAttr.github.dubbo.DubboService;
import org.springframework.stereotype.Component;

/**
 * @Author: chenGang
 * @Date: 2018/1/2 下午3:28
 * @Description:
 */
@Component
public class ConsumerDubboServiceImpl {

    @Reference(version = "1.0.0")
    private DubboService dubboService;

    public void print() {
        User user = dubboService.findByNickName(Constants.nick_name);
        System.out.println(user.toString());
    }
}
