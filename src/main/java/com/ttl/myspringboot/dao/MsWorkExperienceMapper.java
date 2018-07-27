package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsWorkExperience;
import com.ttl.myspringboot.po.MsWorkExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsWorkExperienceMapper {
    int countByExample(MsWorkExperienceExample example);

    int deleteByExample(MsWorkExperienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsWorkExperience record);

    int insertSelective(MsWorkExperience record);

    List<MsWorkExperience> selectByExampleWithBLOBs(MsWorkExperienceExample example);

    List<MsWorkExperience> selectByExample(MsWorkExperienceExample example);

    MsWorkExperience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsWorkExperience record, @Param("example") MsWorkExperienceExample example);

    int updateByExampleWithBLOBs(@Param("record") MsWorkExperience record, @Param("example") MsWorkExperienceExample example);

    int updateByExample(@Param("record") MsWorkExperience record, @Param("example") MsWorkExperienceExample example);

    int updateByPrimaryKeySelective(MsWorkExperience record);

    int updateByPrimaryKeyWithBLOBs(MsWorkExperience record);

    int updateByPrimaryKey(MsWorkExperience record);
}