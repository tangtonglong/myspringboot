package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsGroupLeisureTime;
import com.ttl.myspringboot.po.MsGroupLeisureTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsGroupLeisureTimeMapper {
    int countByExample(MsGroupLeisureTimeExample example);

    int deleteByExample(MsGroupLeisureTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsGroupLeisureTime record);

    int insertSelective(MsGroupLeisureTime record);

    List<MsGroupLeisureTime> selectByExample(MsGroupLeisureTimeExample example);

    MsGroupLeisureTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsGroupLeisureTime record, @Param("example") MsGroupLeisureTimeExample example);

    int updateByExample(@Param("record") MsGroupLeisureTime record, @Param("example") MsGroupLeisureTimeExample example);

    int updateByPrimaryKeySelective(MsGroupLeisureTime record);

    int updateByPrimaryKey(MsGroupLeisureTime record);
}