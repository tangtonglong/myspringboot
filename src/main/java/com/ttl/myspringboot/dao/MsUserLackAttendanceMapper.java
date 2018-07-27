package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserLackAttendance;
import com.ttl.myspringboot.po.MsUserLackAttendanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserLackAttendanceMapper {
    int countByExample(MsUserLackAttendanceExample example);

    int deleteByExample(MsUserLackAttendanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsUserLackAttendance record);

    int insertSelective(MsUserLackAttendance record);

    List<MsUserLackAttendance> selectByExample(MsUserLackAttendanceExample example);

    MsUserLackAttendance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsUserLackAttendance record, @Param("example") MsUserLackAttendanceExample example);

    int updateByExample(@Param("record") MsUserLackAttendance record, @Param("example") MsUserLackAttendanceExample example);

    int updateByPrimaryKeySelective(MsUserLackAttendance record);

    int updateByPrimaryKey(MsUserLackAttendance record);
}