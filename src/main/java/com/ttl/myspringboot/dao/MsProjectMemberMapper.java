package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsProjectMember;
import com.ttl.myspringboot.po.MsProjectMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsProjectMemberMapper {
    int countByExample(MsProjectMemberExample example);

    int deleteByExample(MsProjectMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsProjectMember record);

    int insertSelective(MsProjectMember record);

    List<MsProjectMember> selectByExample(MsProjectMemberExample example);

    MsProjectMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsProjectMember record, @Param("example") MsProjectMemberExample example);

    int updateByExample(@Param("record") MsProjectMember record, @Param("example") MsProjectMemberExample example);

    int updateByPrimaryKeySelective(MsProjectMember record);

    int updateByPrimaryKey(MsProjectMember record);
}