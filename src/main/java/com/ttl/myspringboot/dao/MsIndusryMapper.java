package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsIndusry;
import com.ttl.myspringboot.po.MsIndusryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsIndusryMapper {
    int countByExample(MsIndusryExample example);

    int deleteByExample(MsIndusryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsIndusry record);

    int insertSelective(MsIndusry record);

    List<MsIndusry> selectByExample(MsIndusryExample example);

    MsIndusry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsIndusry record, @Param("example") MsIndusryExample example);

    int updateByExample(@Param("record") MsIndusry record, @Param("example") MsIndusryExample example);

    int updateByPrimaryKeySelective(MsIndusry record);

    int updateByPrimaryKey(MsIndusry record);
}