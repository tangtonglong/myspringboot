package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsTaskRule;
import com.ttl.myspringboot.po.MsTaskRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsTaskRuleMapper {
    int countByExample(MsTaskRuleExample example);

    int deleteByExample(MsTaskRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsTaskRule record);

    int insertSelective(MsTaskRule record);

    List<MsTaskRule> selectByExample(MsTaskRuleExample example);

    MsTaskRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsTaskRule record, @Param("example") MsTaskRuleExample example);

    int updateByExample(@Param("record") MsTaskRule record, @Param("example") MsTaskRuleExample example);

    int updateByPrimaryKeySelective(MsTaskRule record);

    int updateByPrimaryKey(MsTaskRule record);
}