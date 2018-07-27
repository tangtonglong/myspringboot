package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsFlowRecord;
import com.ttl.myspringboot.po.MsFlowRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsFlowRecordMapper {
    int countByExample(MsFlowRecordExample example);

    int deleteByExample(MsFlowRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsFlowRecord record);

    int insertSelective(MsFlowRecord record);

    List<MsFlowRecord> selectByExampleWithBLOBs(MsFlowRecordExample example);

    List<MsFlowRecord> selectByExample(MsFlowRecordExample example);

    MsFlowRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsFlowRecord record, @Param("example") MsFlowRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") MsFlowRecord record, @Param("example") MsFlowRecordExample example);

    int updateByExample(@Param("record") MsFlowRecord record, @Param("example") MsFlowRecordExample example);

    int updateByPrimaryKeySelective(MsFlowRecord record);

    int updateByPrimaryKeyWithBLOBs(MsFlowRecord record);

    int updateByPrimaryKey(MsFlowRecord record);
}