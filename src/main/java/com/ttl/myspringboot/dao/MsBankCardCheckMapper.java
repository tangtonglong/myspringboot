package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsBankCardCheck;
import com.ttl.myspringboot.po.MsBankCardCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsBankCardCheckMapper {
    int countByExample(MsBankCardCheckExample example);

    int deleteByExample(MsBankCardCheckExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsBankCardCheck record);

    int insertSelective(MsBankCardCheck record);

    List<MsBankCardCheck> selectByExample(MsBankCardCheckExample example);

    MsBankCardCheck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsBankCardCheck record, @Param("example") MsBankCardCheckExample example);

    int updateByExample(@Param("record") MsBankCardCheck record, @Param("example") MsBankCardCheckExample example);

    int updateByPrimaryKeySelective(MsBankCardCheck record);

    int updateByPrimaryKey(MsBankCardCheck record);
}