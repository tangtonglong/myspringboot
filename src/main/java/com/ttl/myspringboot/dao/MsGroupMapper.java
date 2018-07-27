package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsGroup;
import com.ttl.myspringboot.po.MsGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsGroupMapper {
    int countByExample(MsGroupExample example);

    int deleteByExample(MsGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsGroup record);

    int insertSelective(MsGroup record);

    List<MsGroup> selectByExampleWithBLOBs(MsGroupExample example);

    List<MsGroup> selectByExample(MsGroupExample example);

    MsGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsGroup record, @Param("example") MsGroupExample example);

    int updateByExampleWithBLOBs(@Param("record") MsGroup record, @Param("example") MsGroupExample example);

    int updateByExample(@Param("record") MsGroup record, @Param("example") MsGroupExample example);

    int updateByPrimaryKeySelective(MsGroup record);

    int updateByPrimaryKeyWithBLOBs(MsGroup record);

    int updateByPrimaryKey(MsGroup record);
}