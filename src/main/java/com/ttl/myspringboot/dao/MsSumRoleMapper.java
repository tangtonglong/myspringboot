package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsSumRole;
import com.ttl.myspringboot.po.MsSumRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsSumRoleMapper {
    int countByExample(MsSumRoleExample example);

    int deleteByExample(MsSumRoleExample example);

    int insert(MsSumRole record);

    int insertSelective(MsSumRole record);

    List<MsSumRole> selectByExample(MsSumRoleExample example);

    int updateByExampleSelective(@Param("record") MsSumRole record, @Param("example") MsSumRoleExample example);

    int updateByExample(@Param("record") MsSumRole record, @Param("example") MsSumRoleExample example);
}