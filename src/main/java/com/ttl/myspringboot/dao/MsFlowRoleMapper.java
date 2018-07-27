package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsFlowRole;
import com.ttl.myspringboot.po.MsFlowRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsFlowRoleMapper {
    int countByExample(MsFlowRoleExample example);

    int deleteByExample(MsFlowRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsFlowRole record);

    int insertSelective(MsFlowRole record);

    List<MsFlowRole> selectByExample(MsFlowRoleExample example);

    MsFlowRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsFlowRole record, @Param("example") MsFlowRoleExample example);

    int updateByExample(@Param("record") MsFlowRole record, @Param("example") MsFlowRoleExample example);

    int updateByPrimaryKeySelective(MsFlowRole record);

    int updateByPrimaryKey(MsFlowRole record);
}