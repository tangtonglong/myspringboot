package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsTimeRule;
import com.ttl.myspringboot.po.MsTimeRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsTimeRuleMapper {
    int countByExample(MsTimeRuleExample example);

    int deleteByExample(MsTimeRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsTimeRule record);

    int insertSelective(MsTimeRule record);

    List<MsTimeRule> selectByExample(MsTimeRuleExample example);

    MsTimeRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsTimeRule record, @Param("example") MsTimeRuleExample example);

    int updateByExample(@Param("record") MsTimeRule record, @Param("example") MsTimeRuleExample example);

    int updateByPrimaryKeySelective(MsTimeRule record);

    int updateByPrimaryKey(MsTimeRule record);
}