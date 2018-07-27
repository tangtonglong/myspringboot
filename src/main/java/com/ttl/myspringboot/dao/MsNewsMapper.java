package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsNews;
import com.ttl.myspringboot.po.MsNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsNewsMapper {
    int countByExample(MsNewsExample example);

    int deleteByExample(MsNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsNews record);

    int insertSelective(MsNews record);

    List<MsNews> selectByExampleWithBLOBs(MsNewsExample example);

    List<MsNews> selectByExample(MsNewsExample example);

    MsNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsNews record, @Param("example") MsNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") MsNews record, @Param("example") MsNewsExample example);

    int updateByExample(@Param("record") MsNews record, @Param("example") MsNewsExample example);

    int updateByPrimaryKeySelective(MsNews record);

    int updateByPrimaryKeyWithBLOBs(MsNews record);

    int updateByPrimaryKey(MsNews record);
}