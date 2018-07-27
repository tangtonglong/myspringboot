package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsFeedback;
import com.ttl.myspringboot.po.MsFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsFeedbackMapper {
    int countByExample(MsFeedbackExample example);

    int deleteByExample(MsFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsFeedback record);

    int insertSelective(MsFeedback record);

    List<MsFeedback> selectByExampleWithBLOBs(MsFeedbackExample example);

    List<MsFeedback> selectByExample(MsFeedbackExample example);

    MsFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsFeedback record, @Param("example") MsFeedbackExample example);

    int updateByExampleWithBLOBs(@Param("record") MsFeedback record, @Param("example") MsFeedbackExample example);

    int updateByExample(@Param("record") MsFeedback record, @Param("example") MsFeedbackExample example);

    int updateByPrimaryKeySelective(MsFeedback record);

    int updateByPrimaryKeyWithBLOBs(MsFeedback record);

    int updateByPrimaryKey(MsFeedback record);
}