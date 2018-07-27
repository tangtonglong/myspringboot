package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsGroupVocationCount;
import com.ttl.myspringboot.po.MsGroupVocationCountExample;
import com.ttl.myspringboot.po.MsGroupVocationCountKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsGroupVocationCountMapper {
    int countByExample(MsGroupVocationCountExample example);

    int deleteByExample(MsGroupVocationCountExample example);

    int deleteByPrimaryKey(MsGroupVocationCountKey key);

    int insert(MsGroupVocationCount record);

    int insertSelective(MsGroupVocationCount record);

    List<MsGroupVocationCount> selectByExample(MsGroupVocationCountExample example);

    MsGroupVocationCount selectByPrimaryKey(MsGroupVocationCountKey key);

    int updateByExampleSelective(@Param("record") MsGroupVocationCount record, @Param("example") MsGroupVocationCountExample example);

    int updateByExample(@Param("record") MsGroupVocationCount record, @Param("example") MsGroupVocationCountExample example);

    int updateByPrimaryKeySelective(MsGroupVocationCount record);

    int updateByPrimaryKey(MsGroupVocationCount record);
}