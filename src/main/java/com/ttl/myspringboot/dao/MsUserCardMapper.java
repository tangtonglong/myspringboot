package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserCard;
import com.ttl.myspringboot.po.MsUserCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserCardMapper {
    int countByExample(MsUserCardExample example);

    int deleteByExample(MsUserCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsUserCard record);

    int insertSelective(MsUserCard record);

    List<MsUserCard> selectByExample(MsUserCardExample example);

    MsUserCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsUserCard record, @Param("example") MsUserCardExample example);

    int updateByExample(@Param("record") MsUserCard record, @Param("example") MsUserCardExample example);

    int updateByPrimaryKeySelective(MsUserCard record);

    int updateByPrimaryKey(MsUserCard record);
}