package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsNewsCollect;
import com.ttl.myspringboot.po.MsNewsCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsNewsCollectMapper {
    int countByExample(MsNewsCollectExample example);

    int deleteByExample(MsNewsCollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsNewsCollect record);

    int insertSelective(MsNewsCollect record);

    List<MsNewsCollect> selectByExample(MsNewsCollectExample example);

    MsNewsCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsNewsCollect record, @Param("example") MsNewsCollectExample example);

    int updateByExample(@Param("record") MsNewsCollect record, @Param("example") MsNewsCollectExample example);

    int updateByPrimaryKeySelective(MsNewsCollect record);

    int updateByPrimaryKey(MsNewsCollect record);
}