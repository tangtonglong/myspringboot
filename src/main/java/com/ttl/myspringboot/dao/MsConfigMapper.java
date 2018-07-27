package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsConfig;
import com.ttl.myspringboot.po.MsConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsConfigMapper {
    int countByExample(MsConfigExample example);

    int deleteByExample(MsConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsConfig record);

    int insertSelective(MsConfig record);

    List<MsConfig> selectByExample(MsConfigExample example);

    MsConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsConfig record, @Param("example") MsConfigExample example);

    int updateByExample(@Param("record") MsConfig record, @Param("example") MsConfigExample example);

    int updateByPrimaryKeySelective(MsConfig record);

    int updateByPrimaryKey(MsConfig record);
}