package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsFlowDetailRecord;
import com.ttl.myspringboot.po.MsFlowDetailRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsFlowDetailRecordMapper {
    int countByExample(MsFlowDetailRecordExample example);

    int deleteByExample(MsFlowDetailRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsFlowDetailRecord record);

    int insertSelective(MsFlowDetailRecord record);

    List<MsFlowDetailRecord> selectByExampleWithBLOBs(MsFlowDetailRecordExample example);

    List<MsFlowDetailRecord> selectByExample(MsFlowDetailRecordExample example);

    MsFlowDetailRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsFlowDetailRecord record, @Param("example") MsFlowDetailRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") MsFlowDetailRecord record, @Param("example") MsFlowDetailRecordExample example);

    int updateByExample(@Param("record") MsFlowDetailRecord record, @Param("example") MsFlowDetailRecordExample example);

    int updateByPrimaryKeySelective(MsFlowDetailRecord record);

    int updateByPrimaryKeyWithBLOBs(MsFlowDetailRecord record);

    int updateByPrimaryKey(MsFlowDetailRecord record);
}