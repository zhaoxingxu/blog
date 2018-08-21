package com.example.blog.service.impl;

import com.example.blog.dao.mapper.TabMapper;
import com.example.blog.entity.Tab;
import com.example.blog.service.TabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TabServiceImpl implements TabService {

    @Autowired
    public TabMapper tabDao;

    public List<Tab> getAllTabs() {
        return tabDao.getAllTabs();
    }

    public Tab getByTabNameEn(String tabNameEn) {
        return tabDao.getByTabNameEn(tabNameEn);
    }
}
