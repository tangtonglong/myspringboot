package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserAttention;
import com.ttl.myspringboot.po.MsUserAttentionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserAttentionMapper {
    int countByExample(MsUserAttentionExample example);

    int deleteByExample(MsUserAttentionExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(MsUserAttention record);

    int insertSelective(MsUserAttention record);

    List<MsUserAttention> selectByExample(MsUserAttentionExample example);

    MsUserAttention selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") MsUserAttention record, @Param("example") MsUserAttentionExample example);

    int updateByExample(@Param("record") MsUserAttention record, @Param("example") MsUserAttentionExample example);

    int updateByPrimaryKeySelective(MsUserAttention record);

    int updateByPrimaryKey(MsUserAttention record);
}