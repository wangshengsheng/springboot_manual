package com.xidian.controller;

import com.xidian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private UserService userService;

    //加produces = "text/html;charset=UTF-8"解决在浏览器显示乱码问题
    @RequestMapping(value = "/index", produces = "text/html;charset=UTF-8")
    public String index() {
        return userService.index();
    }
}