package com.ttl.myspringboot.dao;

import com.ttl.myspringboot.po.gzb01_t_user_sign_strategy_template;
import com.ttl.myspringboot.po.gzb01_t_user_sign_strategy_templateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface gzb01_t_user_sign_strategy_templateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_sign_strategy_template
     *
     * @mbggenerated
     */
    int countByExample(gzb01_t_user_sign_strategy_templateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_sign_strategy_template
     *
     * @mbggenerated
     */
    int deleteByExample(gzb01_t_user_sign_strategy_templateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_sign_strategy_template
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_sign_strategy_template
     *
     * @mbggenerated
     */
    int insert(gzb01_t_user_sign_strategy_template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_sign_strategy_template
     *
     * @mbggenerated
     */
    int insertSelective(gzb01_t_user_sign_strategy_template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_sign_strategy_template
     *
     * @mbggenerated
     */
    List<gzb01_t_user_sign_strategy_template> selectByExample(gzb01_t_user_sign_strategy_templateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_sign_strategy_template
     *
     * @mbggenerated
     */
    gzb01_t_user_sign_strategy_template selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_sign_strategy_template
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") gzb01_t_user_sign_strategy_template record, @Param("example") gzb01_t_user_sign_strategy_templateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_sign_strategy_template
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") gzb01_t_user_sign_strategy_template record, @Param("example") gzb01_t_user_sign_strategy_templateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_sign_strategy_template
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(gzb01_t_user_sign_strategy_template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gzb01_t_user_sign_strategy_template
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(gzb01_t_user_sign_strategy_template record);
}