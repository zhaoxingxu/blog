package com.example.blog.service.impl;

import com.example.blog.dao.InfUserDao;
import com.example.blog.entity.InfUser;
import com.example.blog.service.InfoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoUserServiceImpl implements InfoUserService {
    @Autowired
    InfUserDao infUserDao;

    @Override
    public InfUser getTestUserInfo(String param) {
        return infUserDao.getTestUserInfo(param);
    }
}
