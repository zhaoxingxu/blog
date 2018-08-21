package com.example.blog.entity;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-04-22
 * Time: 8:43
 * Mail: withstars@126.com
 */
public class BaseDomain implements Serializable {
    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
