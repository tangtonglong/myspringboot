package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsGroupApplyRecord;
import com.ttl.myspringboot.po.MsGroupApplyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsGroupApplyRecordMapper {
    int countByExample(MsGroupApplyRecordExample example);

    int deleteByExample(MsGroupApplyRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsGroupApplyRecord record);

    int insertSelective(MsGroupApplyRecord record);

    List<MsGroupApplyRecord> selectByExample(MsGroupApplyRecordExample example);

    MsGroupApplyRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsGroupApplyRecord record, @Param("example") MsGroupApplyRecordExample example);

    int updateByExample(@Param("record") MsGroupApplyRecord record, @Param("example") MsGroupApplyRecordExample example);

    int updateByPrimaryKeySelective(MsGroupApplyRecord record);

    int updateByPrimaryKey(MsGroupApplyRecord record);
}