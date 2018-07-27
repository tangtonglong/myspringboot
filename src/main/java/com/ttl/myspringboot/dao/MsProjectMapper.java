package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsProject;
import com.ttl.myspringboot.po.MsProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsProjectMapper {
    int countByExample(MsProjectExample example);

    int deleteByExample(MsProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsProject record);

    int insertSelective(MsProject record);

    List<MsProject> selectByExample(MsProjectExample example);

    MsProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsProject record, @Param("example") MsProjectExample example);

    int updateByExample(@Param("record") MsProject record, @Param("example") MsProjectExample example);

    int updateByPrimaryKeySelective(MsProject record);

    int updateByPrimaryKey(MsProject record);
}