package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsGzbRoleFunction;
import com.ttl.myspringboot.po.MsGzbRoleFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsGzbRoleFunctionMapper {
    int countByExample(MsGzbRoleFunctionExample example);

    int deleteByExample(MsGzbRoleFunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsGzbRoleFunction record);

    int insertSelective(MsGzbRoleFunction record);

    List<MsGzbRoleFunction> selectByExample(MsGzbRoleFunctionExample example);

    MsGzbRoleFunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsGzbRoleFunction record, @Param("example") MsGzbRoleFunctionExample example);

    int updateByExample(@Param("record") MsGzbRoleFunction record, @Param("example") MsGzbRoleFunctionExample example);

    int updateByPrimaryKeySelective(MsGzbRoleFunction record);

    int updateByPrimaryKey(MsGzbRoleFunction record);
}