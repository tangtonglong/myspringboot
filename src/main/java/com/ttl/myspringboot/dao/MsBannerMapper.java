package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsBanner;
import com.ttl.myspringboot.po.MsBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsBannerMapper {
    int countByExample(MsBannerExample example);

    int deleteByExample(MsBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsBanner record);

    int insertSelective(MsBanner record);

    List<MsBanner> selectByExample(MsBannerExample example);

    MsBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsBanner record, @Param("example") MsBannerExample example);

    int updateByExample(@Param("record") MsBanner record, @Param("example") MsBannerExample example);

    int updateByPrimaryKeySelective(MsBanner record);

    int updateByPrimaryKey(MsBanner record);
}