package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsGroupMember;
import com.ttl.myspringboot.po.MsGroupMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsGroupMemberMapper {
    int countByExample(MsGroupMemberExample example);

    int deleteByExample(MsGroupMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsGroupMember record);

    int insertSelective(MsGroupMember record);

    List<MsGroupMember> selectByExample(MsGroupMemberExample example);

    MsGroupMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsGroupMember record, @Param("example") MsGroupMemberExample example);

    int updateByExample(@Param("record") MsGroupMember record, @Param("example") MsGroupMemberExample example);

    int updateByPrimaryKeySelective(MsGroupMember record);

    int updateByPrimaryKey(MsGroupMember record);
}