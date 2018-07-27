package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserSignStrategyTemplate;
import com.ttl.myspringboot.po.MsUserSignStrategyTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserSignStrategyTemplateMapper {
    int countByExample(MsUserSignStrategyTemplateExample example);

    int deleteByExample(MsUserSignStrategyTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsUserSignStrategyTemplate record);

    int insertSelective(MsUserSignStrategyTemplate record);

    List<MsUserSignStrategyTemplate> selectByExample(MsUserSignStrategyTemplateExample example);

    MsUserSignStrategyTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsUserSignStrategyTemplate record, @Param("example") MsUserSignStrategyTemplateExample example);

    int updateByExample(@Param("record") MsUserSignStrategyTemplate record, @Param("example") MsUserSignStrategyTemplateExample example);

    int updateByPrimaryKeySelective(MsUserSignStrategyTemplate record);

    int updateByPrimaryKey(MsUserSignStrategyTemplate record);
}