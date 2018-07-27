package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsTaskGroup;
import com.ttl.myspringboot.po.MsTaskGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsTaskGroupMapper {
    int countByExample(MsTaskGroupExample example);

    int deleteByExample(MsTaskGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsTaskGroup record);

    int insertSelective(MsTaskGroup record);

    List<MsTaskGroup> selectByExample(MsTaskGroupExample example);

    MsTaskGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsTaskGroup record, @Param("example") MsTaskGroupExample example);

    int updateByExample(@Param("record") MsTaskGroup record, @Param("example") MsTaskGroupExample example);

    int updateByPrimaryKeySelective(MsTaskGroup record);

    int updateByPrimaryKey(MsTaskGroup record);
}