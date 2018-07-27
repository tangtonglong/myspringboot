package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserRecommend;
import com.ttl.myspringboot.po.MsUserRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserRecommendMapper {
    int countByExample(MsUserRecommendExample example);

    int deleteByExample(MsUserRecommendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsUserRecommend record);

    int insertSelective(MsUserRecommend record);

    List<MsUserRecommend> selectByExample(MsUserRecommendExample example);

    MsUserRecommend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsUserRecommend record, @Param("example") MsUserRecommendExample example);

    int updateByExample(@Param("record") MsUserRecommend record, @Param("example") MsUserRecommendExample example);

    int updateByPrimaryKeySelective(MsUserRecommend record);

    int updateByPrimaryKey(MsUserRecommend record);
}