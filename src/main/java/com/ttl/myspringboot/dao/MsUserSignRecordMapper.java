package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserSignRecord;
import com.ttl.myspringboot.po.MsUserSignRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserSignRecordMapper {
    int countByExample(MsUserSignRecordExample example);

    int deleteByExample(MsUserSignRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsUserSignRecord record);

    int insertSelective(MsUserSignRecord record);

    List<MsUserSignRecord> selectByExample(MsUserSignRecordExample example);

    MsUserSignRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsUserSignRecord record, @Param("example") MsUserSignRecordExample example);

    int updateByExample(@Param("record") MsUserSignRecord record, @Param("example") MsUserSignRecordExample example);

    int updateByPrimaryKeySelective(MsUserSignRecord record);

    int updateByPrimaryKey(MsUserSignRecord record);
}