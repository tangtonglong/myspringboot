package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserCheck;
import com.ttl.myspringboot.po.MsUserCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserCheckMapper {
    int countByExample(MsUserCheckExample example);

    int deleteByExample(MsUserCheckExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsUserCheck record);

    int insertSelective(MsUserCheck record);

    List<MsUserCheck> selectByExample(MsUserCheckExample example);

    MsUserCheck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsUserCheck record, @Param("example") MsUserCheckExample example);

    int updateByExample(@Param("record") MsUserCheck record, @Param("example") MsUserCheckExample example);

    int updateByPrimaryKeySelective(MsUserCheck record);

    int updateByPrimaryKey(MsUserCheck record);
}