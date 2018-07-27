package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.MsDistrict;
import com.ttl.myspringboot.po.MsDistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsDistrictMapper {
    int countByExample(MsDistrictExample example);

    int deleteByExample(MsDistrictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsDistrict record);

    int insertSelective(MsDistrict record);

    List<MsDistrict> selectByExample(MsDistrictExample example);

    MsDistrict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsDistrict record, @Param("example") MsDistrictExample example);

    int updateByExample(@Param("record") MsDistrict record, @Param("example") MsDistrictExample example);

    int updateByPrimaryKeySelective(MsDistrict record);

    int updateByPrimaryKey(MsDistrict record);
}