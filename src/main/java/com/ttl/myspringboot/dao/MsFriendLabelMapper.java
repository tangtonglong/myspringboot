package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsFriendLabelExample;
import com.ttl.myspringboot.po.MsFriendLabelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsFriendLabelMapper {
    int countByExample(MsFriendLabelExample example);

    int deleteByExample(MsFriendLabelExample example);

    int deleteByPrimaryKey(MsFriendLabelKey key);

    int insert(MsFriendLabelKey record);

    int insertSelective(MsFriendLabelKey record);

    List<MsFriendLabelKey> selectByExample(MsFriendLabelExample example);

    int updateByExampleSelective(@Param("record") MsFriendLabelKey record, @Param("example") MsFriendLabelExample example);

    int updateByExample(@Param("record") MsFriendLabelKey record, @Param("example") MsFriendLabelExample example);
}