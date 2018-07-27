package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserLeisureTime;
import com.ttl.myspringboot.po.MsUserLeisureTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserLeisureTimeMapper {
    int countByExample(MsUserLeisureTimeExample example);

    int deleteByExample(MsUserLeisureTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsUserLeisureTime record);

    int insertSelective(MsUserLeisureTime record);

    List<MsUserLeisureTime> selectByExample(MsUserLeisureTimeExample example);

    MsUserLeisureTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsUserLeisureTime record, @Param("example") MsUserLeisureTimeExample example);

    int updateByExample(@Param("record") MsUserLeisureTime record, @Param("example") MsUserLeisureTimeExample example);

    int updateByPrimaryKeySelective(MsUserLeisureTime record);

    int updateByPrimaryKey(MsUserLeisureTime record);
}