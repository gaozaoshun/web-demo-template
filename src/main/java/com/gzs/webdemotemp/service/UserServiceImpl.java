package com.gzs.webdemotemp.service;

import com.gzs.webdemotemp.dao.UserMapper;
import com.gzs.webdemotemp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desp
 * @Date 2018/2/26
 * @Author mtty
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserMapper userMapper;

    @Override
    public User queryById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
