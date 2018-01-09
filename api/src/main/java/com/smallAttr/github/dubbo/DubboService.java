package com.smallAttr.github.dubbo;

import com.smallAttr.github.domain.User;

/**
 * @Author: chenGang
 * @Date: 2018/1/2 下午3:15
 * @Description:
 */
public interface DubboService {

    User findByNickName(String nickName);
}
