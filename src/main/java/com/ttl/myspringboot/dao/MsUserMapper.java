package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUser;
import com.ttl.myspringboot.po.MsUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

@CachePut
@Mapper
public interface MsUserMapper {
    int countByExample(MsUserExample example);

    int deleteByExample(MsUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsUser record);

    int insertSelective(MsUser record);

    @Cacheable(value = "all", keyGenerator = "wiselyKeyGenerator")
    List<MsUser> selectByExample(MsUserExample example);

    @Cacheable(value = "findById", keyGenerator = "wiselyKeyGenerator")
    MsUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsUser record, @Param("example") MsUserExample example);

    int updateByExample(@Param("record") MsUser record, @Param("example") MsUserExample example);

    int updateByPrimaryKeySelective(MsUser record);

    int updateByPrimaryKey(MsUser record);
}