package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsApplyRecord;
import com.ttl.myspringboot.po.MsApplyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsApplyRecordMapper {
    int countByExample(MsApplyRecordExample example);

    int deleteByExample(MsApplyRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsApplyRecord record);

    int insertSelective(MsApplyRecord record);

    List<MsApplyRecord> selectByExample(MsApplyRecordExample example);

    MsApplyRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsApplyRecord record, @Param("example") MsApplyRecordExample example);

    int updateByExample(@Param("record") MsApplyRecord record, @Param("example") MsApplyRecordExample example);

    int updateByPrimaryKeySelective(MsApplyRecord record);

    int updateByPrimaryKey(MsApplyRecord record);
}