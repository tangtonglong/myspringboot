package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsSmsCode;
import com.ttl.myspringboot.po.MsSmsCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsSmsCodeMapper {
    int countByExample(MsSmsCodeExample example);

    int deleteByExample(MsSmsCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsSmsCode record);

    int insertSelective(MsSmsCode record);

    List<MsSmsCode> selectByExample(MsSmsCodeExample example);

    MsSmsCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsSmsCode record, @Param("example") MsSmsCodeExample example);

    int updateByExample(@Param("record") MsSmsCode record, @Param("example") MsSmsCodeExample example);

    int updateByPrimaryKeySelective(MsSmsCode record);

    int updateByPrimaryKey(MsSmsCode record);
}