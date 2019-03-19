package com.tcs.gmall.service.impl;

import com.tcs.gmall.bean.UserAddress;
import com.tcs.gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * 传入userService的远程代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("userServiceStub");
        if(StringUtils.isEmpty(userId)){
            userService.getUserAddressList(userId);
        }
        return null;
    }
}
