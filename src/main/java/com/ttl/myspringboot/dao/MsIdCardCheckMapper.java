package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsIdCardCheck;
import com.ttl.myspringboot.po.MsIdCardCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsIdCardCheckMapper {
    int countByExample(MsIdCardCheckExample example);

    int deleteByExample(MsIdCardCheckExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsIdCardCheck record);

    int insertSelective(MsIdCardCheck record);

    List<MsIdCardCheck> selectByExample(MsIdCardCheckExample example);

    MsIdCardCheck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsIdCardCheck record, @Param("example") MsIdCardCheckExample example);

    int updateByExample(@Param("record") MsIdCardCheck record, @Param("example") MsIdCardCheckExample example);

    int updateByPrimaryKeySelective(MsIdCardCheck record);

    int updateByPrimaryKey(MsIdCardCheck record);
}