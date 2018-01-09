package com.smallAttr.github.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.smallAttr.github.domain.User;
import com.smallAttr.github.dubbo.DubboService;

/**
 * @Author: chenGang
 * @Date: 2018/1/2 下午3:16
 * @Description:
 */
@Service(version = "1.0.0")
public class ProviderDubboServiceImpl implements DubboService {

    @Override
    public User findByNickName(String nickName) {
        return new User();
    }
}
