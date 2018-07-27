package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsConfigCode;
import com.ttl.myspringboot.po.MsConfigCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsConfigCodeMapper {
    int countByExample(MsConfigCodeExample example);

    int deleteByExample(MsConfigCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsConfigCode record);

    int insertSelective(MsConfigCode record);

    List<MsConfigCode> selectByExample(MsConfigCodeExample example);

    MsConfigCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsConfigCode record, @Param("example") MsConfigCodeExample example);

    int updateByExample(@Param("record") MsConfigCode record, @Param("example") MsConfigCodeExample example);

    int updateByPrimaryKeySelective(MsConfigCode record);

    int updateByPrimaryKey(MsConfigCode record);
}