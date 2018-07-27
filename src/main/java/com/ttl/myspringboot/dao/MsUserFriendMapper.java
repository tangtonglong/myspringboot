package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserFriend;
import com.ttl.myspringboot.po.MsUserFriendExample;
import com.ttl.myspringboot.po.MsUserFriendKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserFriendMapper {
    int countByExample(MsUserFriendExample example);

    int deleteByExample(MsUserFriendExample example);

    int deleteByPrimaryKey(MsUserFriendKey key);

    int insert(MsUserFriend record);

    int insertSelective(MsUserFriend record);

    List<MsUserFriend> selectByExample(MsUserFriendExample example);

    MsUserFriend selectByPrimaryKey(MsUserFriendKey key);

    int updateByExampleSelective(@Param("record") MsUserFriend record, @Param("example") MsUserFriendExample example);

    int updateByExample(@Param("record") MsUserFriend record, @Param("example") MsUserFriendExample example);

    int updateByPrimaryKeySelective(MsUserFriend record);

    int updateByPrimaryKey(MsUserFriend record);
}