package com.power.service;

import com.power.domain.ResponseResult;
import com.power.domain.entity.User;

/**
 * @author power
 * @Date 2023/1/10 15:51
 */
public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
