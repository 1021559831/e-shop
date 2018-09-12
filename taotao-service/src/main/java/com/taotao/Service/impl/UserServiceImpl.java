package com.taotao.Service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.taotao.Service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(){
        System.out.println("调用了UserServiceImpl的save方法!");
    }
}
