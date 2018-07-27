package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsFunc;
import com.ttl.myspringboot.po.MsFuncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsFuncMapper {
    int countByExample(MsFuncExample example);

    int deleteByExample(MsFuncExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsFunc record);

    int insertSelective(MsFunc record);

    List<MsFunc> selectByExample(MsFuncExample example);

    MsFunc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsFunc record, @Param("example") MsFuncExample example);

    int updateByExample(@Param("record") MsFunc record, @Param("example") MsFuncExample example);

    int updateByPrimaryKeySelective(MsFunc record);

    int updateByPrimaryKey(MsFunc record);
}