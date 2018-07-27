package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsCompany;
import com.ttl.myspringboot.po.MsCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsCompanyMapper {
    int countByExample(MsCompanyExample example);

    int deleteByExample(MsCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsCompany record);

    int insertSelective(MsCompany record);

    List<MsCompany> selectByExample(MsCompanyExample example);

    MsCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsCompany record, @Param("example") MsCompanyExample example);

    int updateByExample(@Param("record") MsCompany record, @Param("example") MsCompanyExample example);

    int updateByPrimaryKeySelective(MsCompany record);

    int updateByPrimaryKey(MsCompany record);
}