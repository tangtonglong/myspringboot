package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsRegister;
import com.ttl.myspringboot.po.MsRegisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsRegisterMapper {
    int countByExample(MsRegisterExample example);

    int deleteByExample(MsRegisterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsRegister record);

    int insertSelective(MsRegister record);

    List<MsRegister> selectByExample(MsRegisterExample example);

    MsRegister selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsRegister record, @Param("example") MsRegisterExample example);

    int updateByExample(@Param("record") MsRegister record, @Param("example") MsRegisterExample example);

    int updateByPrimaryKeySelective(MsRegister record);

    int updateByPrimaryKey(MsRegister record);
}