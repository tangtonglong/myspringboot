package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserRetroactive;
import com.ttl.myspringboot.po.MsUserRetroactiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserRetroactiveMapper {
    int countByExample(MsUserRetroactiveExample example);

    int deleteByExample(MsUserRetroactiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsUserRetroactive record);

    int insertSelective(MsUserRetroactive record);

    List<MsUserRetroactive> selectByExample(MsUserRetroactiveExample example);

    MsUserRetroactive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsUserRetroactive record, @Param("example") MsUserRetroactiveExample example);

    int updateByExample(@Param("record") MsUserRetroactive record, @Param("example") MsUserRetroactiveExample example);

    int updateByPrimaryKeySelective(MsUserRetroactive record);

    int updateByPrimaryKey(MsUserRetroactive record);
}