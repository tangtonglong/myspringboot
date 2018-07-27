package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsVocation;
import com.ttl.myspringboot.po.MsVocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsVocationMapper {
    int countByExample(MsVocationExample example);

    int deleteByExample(MsVocationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsVocation record);

    int insertSelective(MsVocation record);

    List<MsVocation> selectByExample(MsVocationExample example);

    MsVocation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsVocation record, @Param("example") MsVocationExample example);

    int updateByExample(@Param("record") MsVocation record, @Param("example") MsVocationExample example);

    int updateByPrimaryKeySelective(MsVocation record);

    int updateByPrimaryKey(MsVocation record);
}