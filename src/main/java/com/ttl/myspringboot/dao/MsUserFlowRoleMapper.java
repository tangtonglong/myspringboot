package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserFlowRole;
import com.ttl.myspringboot.po.MsUserFlowRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserFlowRoleMapper {
    int countByExample(MsUserFlowRoleExample example);

    int deleteByExample(MsUserFlowRoleExample example);

    int insert(MsUserFlowRole record);

    int insertSelective(MsUserFlowRole record);

    List<MsUserFlowRole> selectByExample(MsUserFlowRoleExample example);

    int updateByExampleSelective(@Param("record") MsUserFlowRole record, @Param("example") MsUserFlowRoleExample example);

    int updateByExample(@Param("record") MsUserFlowRole record, @Param("example") MsUserFlowRoleExample example);
}