package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsBannerPic;
import com.ttl.myspringboot.po.MsBannerPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsBannerPicMapper {
    int countByExample(MsBannerPicExample example);

    int deleteByExample(MsBannerPicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsBannerPic record);

    int insertSelective(MsBannerPic record);

    List<MsBannerPic> selectByExample(MsBannerPicExample example);

    MsBannerPic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsBannerPic record, @Param("example") MsBannerPicExample example);

    int updateByExample(@Param("record") MsBannerPic record, @Param("example") MsBannerPicExample example);

    int updateByPrimaryKeySelective(MsBannerPic record);

    int updateByPrimaryKey(MsBannerPic record);
}