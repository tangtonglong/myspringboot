package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsUserCompany;
import com.ttl.myspringboot.po.MsUserCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsUserCompanyMapper {
    int countByExample(MsUserCompanyExample example);

    int deleteByExample(MsUserCompanyExample example);

    int insert(MsUserCompany record);

    int insertSelective(MsUserCompany record);

    List<MsUserCompany> selectByExample(MsUserCompanyExample example);

    int updateByExampleSelective(@Param("record") MsUserCompany record, @Param("example") MsUserCompanyExample example);

    int updateByExample(@Param("record") MsUserCompany record, @Param("example") MsUserCompanyExample example);
}