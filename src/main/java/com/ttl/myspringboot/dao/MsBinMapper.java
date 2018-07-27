package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsBin;
import com.ttl.myspringboot.po.MsBinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsBinMapper {
    int countByExample(MsBinExample example);

    int deleteByExample(MsBinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsBin record);

    int insertSelective(MsBin record);

    List<MsBin> selectByExample(MsBinExample example);

    MsBin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsBin record, @Param("example") MsBinExample example);

    int updateByExample(@Param("record") MsBin record, @Param("example") MsBinExample example);

    int updateByPrimaryKeySelective(MsBin record);

    int updateByPrimaryKey(MsBin record);
}