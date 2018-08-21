package com.example.blog.dao.impl;

import com.example.blog.dao.InfUserDao;
import com.example.blog.dao.mapper.InfUserMapper;
import com.example.blog.entity.InfUser;
import com.example.blog.entity.InfUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InfUserDaoImpl implements InfUserDao {
    @Autowired
    InfUserMapper infUserMapper;

    @Override
    public InfUser getTestUserInfo(String param) {
        InfUserExample params = new InfUserExample();
        params.createCriteria().andNameEqualTo(param);
        List<InfUser> users = infUserMapper.selectByExample(params);
        return users.isEmpty()?null:users.get(0);
    }
}
