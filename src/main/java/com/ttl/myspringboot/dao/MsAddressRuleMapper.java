package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsAddressRule;
import com.ttl.myspringboot.po.MsAddressRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsAddressRuleMapper {
    int countByExample(MsAddressRuleExample example);

    int deleteByExample(MsAddressRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsAddressRule record);

    int insertSelective(MsAddressRule record);

    List<MsAddressRule> selectByExample(MsAddressRuleExample example);

    MsAddressRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsAddressRule record, @Param("example") MsAddressRuleExample example);

    int updateByExample(@Param("record") MsAddressRule record, @Param("example") MsAddressRuleExample example);

    int updateByPrimaryKeySelective(MsAddressRule record);

    int updateByPrimaryKey(MsAddressRule record);
}