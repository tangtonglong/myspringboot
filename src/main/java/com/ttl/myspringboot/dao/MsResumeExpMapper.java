package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsResumeExp;
import com.ttl.myspringboot.po.MsResumeExpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsResumeExpMapper {
    int countByExample(MsResumeExpExample example);

    int deleteByExample(MsResumeExpExample example);

    int insert(MsResumeExp record);

    int insertSelective(MsResumeExp record);

    List<MsResumeExp> selectByExample(MsResumeExpExample example);

    int updateByExampleSelective(@Param("record") MsResumeExp record, @Param("example") MsResumeExpExample example);

    int updateByExample(@Param("record") MsResumeExp record, @Param("example") MsResumeExpExample example);
}