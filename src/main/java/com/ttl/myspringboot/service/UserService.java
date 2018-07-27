package com.ttl.myspringboot.service;

import com.ttl.myspringboot.po.MsUser;

import java.util.List;

/**
 * @author Tangtl
 * @program: myspringboot
 * @Package com.ttl.myspringboot.service
 * @Title: UserService
 * @Description:
 * @date 2018-07-27  13:43
 */
public interface UserService {

    int addUser(MsUser msUser);

    List<MsUser> findAllUser();
}
