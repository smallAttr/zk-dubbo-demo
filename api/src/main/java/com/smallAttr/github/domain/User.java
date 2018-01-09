package com.smallAttr.github.domain;

import com.smallAttr.github.constants.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: chenGang
 * @Date: 2018/1/2 下午3:12
 * @Description:
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    private Long id;

    private String nickName;

    public User() {
        this.id = Long.MIN_VALUE;
        this.nickName = Constants.nick_name;
    }
}
