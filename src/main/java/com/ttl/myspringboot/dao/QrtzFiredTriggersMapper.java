package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.QrtzFiredTriggers;
import com.ttl.myspringboot.po.QrtzFiredTriggersExample;
import com.ttl.myspringboot.po.QrtzFiredTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzFiredTriggersMapper {
    int countByExample(QrtzFiredTriggersExample example);

    int deleteByExample(QrtzFiredTriggersExample example);

    int deleteByPrimaryKey(QrtzFiredTriggersKey key);

    int insert(QrtzFiredTriggers record);

    int insertSelective(QrtzFiredTriggers record);

    List<QrtzFiredTriggers> selectByExample(QrtzFiredTriggersExample example);

    QrtzFiredTriggers selectByPrimaryKey(QrtzFiredTriggersKey key);

    int updateByExampleSelective(@Param("record") QrtzFiredTriggers record, @Param("example") QrtzFiredTriggersExample example);

    int updateByExample(@Param("record") QrtzFiredTriggers record, @Param("example") QrtzFiredTriggersExample example);

    int updateByPrimaryKeySelective(QrtzFiredTriggers record);

    int updateByPrimaryKey(QrtzFiredTriggers record);
}