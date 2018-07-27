package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsMessage;
import com.ttl.myspringboot.po.MsMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsMessageMapper {
    int countByExample(MsMessageExample example);

    int deleteByExample(MsMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsMessage record);

    int insertSelective(MsMessage record);

    List<MsMessage> selectByExampleWithBLOBs(MsMessageExample example);

    List<MsMessage> selectByExample(MsMessageExample example);

    MsMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsMessage record, @Param("example") MsMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") MsMessage record, @Param("example") MsMessageExample example);

    int updateByExample(@Param("record") MsMessage record, @Param("example") MsMessageExample example);

    int updateByPrimaryKeySelective(MsMessage record);

    int updateByPrimaryKeyWithBLOBs(MsMessage record);

    int updateByPrimaryKey(MsMessage record);
}