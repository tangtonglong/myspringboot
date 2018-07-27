package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.QrtzCronTriggers;
import com.ttl.myspringboot.po.QrtzCronTriggersExample;
import com.ttl.myspringboot.po.QrtzCronTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzCronTriggersMapper {
    int countByExample(QrtzCronTriggersExample example);

    int deleteByExample(QrtzCronTriggersExample example);

    int deleteByPrimaryKey(QrtzCronTriggersKey key);

    int insert(QrtzCronTriggers record);

    int insertSelective(QrtzCronTriggers record);

    List<QrtzCronTriggers> selectByExample(QrtzCronTriggersExample example);

    QrtzCronTriggers selectByPrimaryKey(QrtzCronTriggersKey key);

    int updateByExampleSelective(@Param("record") QrtzCronTriggers record, @Param("example") QrtzCronTriggersExample example);

    int updateByExample(@Param("record") QrtzCronTriggers record, @Param("example") QrtzCronTriggersExample example);

    int updateByPrimaryKeySelective(QrtzCronTriggers record);

    int updateByPrimaryKey(QrtzCronTriggers record);
}