package com.example.blog.service.impl;

import com.example.blog.dao.mapper.LoginLogMapper;
import com.example.blog.entity.LoginLog;
import com.example.blog.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired
    public LoginLogMapper loginLogDao;

    public boolean addLog(LoginLog log) {

        if(loginLogDao.insert(log)>0){
            return true;
        }else {
            return false;
        }
    }
}
