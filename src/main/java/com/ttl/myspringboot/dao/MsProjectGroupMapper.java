package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsProjectGroup;
import com.ttl.myspringboot.po.MsProjectGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsProjectGroupMapper {
    int countByExample(MsProjectGroupExample example);

    int deleteByExample(MsProjectGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsProjectGroup record);

    int insertSelective(MsProjectGroup record);

    List<MsProjectGroup> selectByExample(MsProjectGroupExample example);

    MsProjectGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsProjectGroup record, @Param("example") MsProjectGroupExample example);

    int updateByExample(@Param("record") MsProjectGroup record, @Param("example") MsProjectGroupExample example);

    int updateByPrimaryKeySelective(MsProjectGroup record);

    int updateByPrimaryKey(MsProjectGroup record);
}