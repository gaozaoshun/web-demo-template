package com.gzs.webdemotemp.controller;

import com.gzs.webdemotemp.dto.ResponseData;
import com.gzs.webdemotemp.model.User;
import com.gzs.webdemotemp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desp
 * @Date 2018/2/26
 * @Author mtty
 */
@RestController
@RequestMapping("v1/api")
public class IndexController {

    @Autowired
    public UserService userService;

    @GetMapping("index")
    public ResponseData index(Integer id){
        User user = userService.queryById(id);
        return ResponseData.success(user);
    }
}
