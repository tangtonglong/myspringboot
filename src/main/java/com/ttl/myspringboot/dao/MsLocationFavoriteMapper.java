package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsLocationFavorite;
import com.ttl.myspringboot.po.MsLocationFavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsLocationFavoriteMapper {
    int countByExample(MsLocationFavoriteExample example);

    int deleteByExample(MsLocationFavoriteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsLocationFavorite record);

    int insertSelective(MsLocationFavorite record);

    List<MsLocationFavorite> selectByExample(MsLocationFavoriteExample example);

    MsLocationFavorite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsLocationFavorite record, @Param("example") MsLocationFavoriteExample example);

    int updateByExample(@Param("record") MsLocationFavorite record, @Param("example") MsLocationFavoriteExample example);

    int updateByPrimaryKeySelective(MsLocationFavorite record);

    int updateByPrimaryKey(MsLocationFavorite record);
}