package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserLabel;
import com.ttl.myspringboot.po.MsUserLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserLabelMapper {
    int countByExample(MsUserLabelExample example);

    int deleteByExample(MsUserLabelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsUserLabel record);

    int insertSelective(MsUserLabel record);

    List<MsUserLabel> selectByExample(MsUserLabelExample example);

    MsUserLabel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsUserLabel record, @Param("example") MsUserLabelExample example);

    int updateByExample(@Param("record") MsUserLabel record, @Param("example") MsUserLabelExample example);

    int updateByPrimaryKeySelective(MsUserLabel record);

    int updateByPrimaryKey(MsUserLabel record);
}