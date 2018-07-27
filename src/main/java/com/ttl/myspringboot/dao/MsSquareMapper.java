package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsSquare;
import com.ttl.myspringboot.po.MsSquareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsSquareMapper {
    int countByExample(MsSquareExample example);

    int deleteByExample(MsSquareExample example);

    int insert(MsSquare record);

    int insertSelective(MsSquare record);

    List<MsSquare> selectByExample(MsSquareExample example);

    int updateByExampleSelective(@Param("record") MsSquare record, @Param("example") MsSquareExample example);

    int updateByExample(@Param("record") MsSquare record, @Param("example") MsSquareExample example);
}