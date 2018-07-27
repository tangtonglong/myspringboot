package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsFlowDetail;
import com.ttl.myspringboot.po.MsFlowDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsFlowDetailMapper {
    int countByExample(MsFlowDetailExample example);

    int deleteByExample(MsFlowDetailExample example);

    int insert(MsFlowDetail record);

    int insertSelective(MsFlowDetail record);

    List<MsFlowDetail> selectByExample(MsFlowDetailExample example);

    int updateByExampleSelective(@Param("record") MsFlowDetail record, @Param("example") MsFlowDetailExample example);

    int updateByExample(@Param("record") MsFlowDetail record, @Param("example") MsFlowDetailExample example);
}