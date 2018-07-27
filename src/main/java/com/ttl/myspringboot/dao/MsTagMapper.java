package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsTag;
import com.ttl.myspringboot.po.MsTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsTagMapper {
    int countByExample(MsTagExample example);

    int deleteByExample(MsTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsTag record);

    int insertSelective(MsTag record);

    List<MsTag> selectByExample(MsTagExample example);

    MsTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsTag record, @Param("example") MsTagExample example);

    int updateByExample(@Param("record") MsTag record, @Param("example") MsTagExample example);

    int updateByPrimaryKeySelective(MsTag record);

    int updateByPrimaryKey(MsTag record);
}