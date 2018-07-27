package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsResume;
import com.ttl.myspringboot.po.MsResumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsResumeMapper {
    int countByExample(MsResumeExample example);

    int deleteByExample(MsResumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsResume record);

    int insertSelective(MsResume record);

    List<MsResume> selectByExampleWithBLOBs(MsResumeExample example);

    List<MsResume> selectByExample(MsResumeExample example);

    MsResume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsResume record, @Param("example") MsResumeExample example);

    int updateByExampleWithBLOBs(@Param("record") MsResume record, @Param("example") MsResumeExample example);

    int updateByExample(@Param("record") MsResume record, @Param("example") MsResumeExample example);

    int updateByPrimaryKeySelective(MsResume record);

    int updateByPrimaryKeyWithBLOBs(MsResume record);

    int updateByPrimaryKey(MsResume record);
}