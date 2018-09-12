package com.taotao.controller;

import jdk.nashorn.internal.ir.annotations.Reference;

public class UserController {
    @Reference
    private UserService userService;

    public String save(){
        System.out.println("save!");
        userService.save();
        return "save success~!"
    }
}
