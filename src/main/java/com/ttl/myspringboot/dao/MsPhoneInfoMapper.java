package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsPhoneInfo;
import com.ttl.myspringboot.po.MsPhoneInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsPhoneInfoMapper {
    int countByExample(MsPhoneInfoExample example);

    int deleteByExample(MsPhoneInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsPhoneInfo record);

    int insertSelective(MsPhoneInfo record);

    List<MsPhoneInfo> selectByExample(MsPhoneInfoExample example);

    MsPhoneInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsPhoneInfo record, @Param("example") MsPhoneInfoExample example);

    int updateByExample(@Param("record") MsPhoneInfo record, @Param("example") MsPhoneInfoExample example);

    int updateByPrimaryKeySelective(MsPhoneInfo record);

    int updateByPrimaryKey(MsPhoneInfo record);
}