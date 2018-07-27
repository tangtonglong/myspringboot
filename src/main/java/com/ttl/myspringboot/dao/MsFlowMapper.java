package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsFlow;
import com.ttl.myspringboot.po.MsFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsFlowMapper {
    int countByExample(MsFlowExample example);

    int deleteByExample(MsFlowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsFlow record);

    int insertSelective(MsFlow record);

    List<MsFlow> selectByExample(MsFlowExample example);

    MsFlow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsFlow record, @Param("example") MsFlowExample example);

    int updateByExample(@Param("record") MsFlow record, @Param("example") MsFlowExample example);

    int updateByPrimaryKeySelective(MsFlow record);

    int updateByPrimaryKey(MsFlow record);
}