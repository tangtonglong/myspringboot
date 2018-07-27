package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsAppoint;
import com.ttl.myspringboot.po.MsAppointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsAppointMapper {
    int countByExample(MsAppointExample example);

    int deleteByExample(MsAppointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsAppoint record);

    int insertSelective(MsAppoint record);

    List<MsAppoint> selectByExampleWithBLOBs(MsAppointExample example);

    List<MsAppoint> selectByExample(MsAppointExample example);

    MsAppoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsAppoint record, @Param("example") MsAppointExample example);

    int updateByExampleWithBLOBs(@Param("record") MsAppoint record, @Param("example") MsAppointExample example);

    int updateByExample(@Param("record") MsAppoint record, @Param("example") MsAppointExample example);

    int updateByPrimaryKeySelective(MsAppoint record);

    int updateByPrimaryKeyWithBLOBs(MsAppoint record);

    int updateByPrimaryKey(MsAppoint record);
}