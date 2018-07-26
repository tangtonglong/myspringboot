package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.gzb01_t_user_company;
import com.ttl.myspringboot.po.gzb01_t_user_companyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface gzb01_t_user_companyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_company
     *
     * @mbggenerated
     */
    int countByExample(gzb01_t_user_companyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_company
     *
     * @mbggenerated
     */
    int deleteByExample(gzb01_t_user_companyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_company
     *
     * @mbggenerated
     */
    int insert(gzb01_t_user_company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_company
     *
     * @mbggenerated
     */
    int insertSelective(gzb01_t_user_company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_company
     *
     * @mbggenerated
     */
    List<gzb01_t_user_company> selectByExample(gzb01_t_user_companyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_company
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") gzb01_t_user_company record, @Param("example") gzb01_t_user_companyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_company
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") gzb01_t_user_company record, @Param("example") gzb01_t_user_companyExample example);
}