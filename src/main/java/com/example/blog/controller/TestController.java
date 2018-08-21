package com.example.blog.controller;

import com.example.blog.entity.InfUser;
import com.example.blog.service.InfoUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    InfoUserService infoUserService;
    @RequestMapping(value = "/test/test",method = RequestMethod.GET)
    public InfUser test(@RequestParam String param){
        logger.debug("======================>>:","/test/test");
        return infoUserService.getTestUserInfo(param);

    }
    @RequestMapping(value = "/test",method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
    public InfUser test2(@RequestBody String param){
        logger.debug("======================>>:{},{}","/test",param);
        return infoUserService.getTestUserInfo(param);
    }
}
