package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.QrtzSimpropTriggers;
import com.ttl.myspringboot.po.QrtzSimpropTriggersExample;
import com.ttl.myspringboot.po.QrtzSimpropTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzSimpropTriggersMapper {
    int countByExample(QrtzSimpropTriggersExample example);

    int deleteByExample(QrtzSimpropTriggersExample example);

    int deleteByPrimaryKey(QrtzSimpropTriggersKey key);

    int insert(QrtzSimpropTriggers record);

    int insertSelective(QrtzSimpropTriggers record);

    List<QrtzSimpropTriggers> selectByExample(QrtzSimpropTriggersExample example);

    QrtzSimpropTriggers selectByPrimaryKey(QrtzSimpropTriggersKey key);

    int updateByExampleSelective(@Param("record") QrtzSimpropTriggers record, @Param("example") QrtzSimpropTriggersExample example);

    int updateByExample(@Param("record") QrtzSimpropTriggers record, @Param("example") QrtzSimpropTriggersExample example);

    int updateByPrimaryKeySelective(QrtzSimpropTriggers record);

    int updateByPrimaryKey(QrtzSimpropTriggers record);
}