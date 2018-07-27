package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsSignStrategy;
import com.ttl.myspringboot.po.MsSignStrategyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsSignStrategyMapper {
    int countByExample(MsSignStrategyExample example);

    int deleteByExample(MsSignStrategyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsSignStrategy record);

    int insertSelective(MsSignStrategy record);

    List<MsSignStrategy> selectByExample(MsSignStrategyExample example);

    MsSignStrategy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsSignStrategy record, @Param("example") MsSignStrategyExample example);

    int updateByExample(@Param("record") MsSignStrategy record, @Param("example") MsSignStrategyExample example);

    int updateByPrimaryKeySelective(MsSignStrategy record);

    int updateByPrimaryKey(MsSignStrategy record);
}