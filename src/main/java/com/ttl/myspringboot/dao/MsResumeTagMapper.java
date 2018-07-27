package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsResumeTag;
import com.ttl.myspringboot.po.MsResumeTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsResumeTagMapper {
    int countByExample(MsResumeTagExample example);

    int deleteByExample(MsResumeTagExample example);

    int insert(MsResumeTag record);

    int insertSelective(MsResumeTag record);

    List<MsResumeTag> selectByExample(MsResumeTagExample example);

    int updateByExampleSelective(@Param("record") MsResumeTag record, @Param("example") MsResumeTagExample example);

    int updateByExample(@Param("record") MsResumeTag record, @Param("example") MsResumeTagExample example);
}