package com.example.blog.dao.mapper;

import com.example.blog.entity.InfUser;
import com.example.blog.entity.InfUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface InfUserMapper {
    long countByExample(InfUserExample example);

    int deleteByExample(InfUserExample example);

    int insert(InfUser record);

    int insertSelective(InfUser record);

    List<InfUser> selectByExample(InfUserExample example);

    int updateByExampleSelective(@Param("record") InfUser record, @Param("example") InfUserExample example);

    int updateByExample(@Param("record") InfUser record, @Param("example") InfUserExample example);
}