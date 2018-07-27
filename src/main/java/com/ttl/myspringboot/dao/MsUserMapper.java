package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUser;
import com.ttl.myspringboot.po.MsUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MsUserMapper {
    int countByExample(MsUserExample example);

    int deleteByExample(MsUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsUser record);

    int insertSelective(MsUser record);

    List<MsUser> selectByExample(MsUserExample example);

    MsUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsUser record, @Param("example") MsUserExample example);

    int updateByExample(@Param("record") MsUser record, @Param("example") MsUserExample example);

    int updateByPrimaryKeySelective(MsUser record);

    int updateByPrimaryKey(MsUser record);
}