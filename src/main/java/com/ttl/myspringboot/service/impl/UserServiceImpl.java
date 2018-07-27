package com.ttl.myspringboot.service.impl;

import com.ttl.myspringboot.dao.MsUserMapper;
import com.ttl.myspringboot.po.MsUser;
import com.ttl.myspringboot.po.MsUserExample;
import com.ttl.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tangtl
 * @program: myspringboot
 * @Package com.ttl.myspringboot.service.impl
 * @Title: UserServiceImpl
 * @Description:
 * @date 2018-07-27  13:43
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MsUserMapper msUserMapper;//这里会报错，但是并不会影响

    @Override
    public int addUser(MsUser msUser) {

//        return msUserMapper.insertSelective(msUser);
        return 1;
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public List<MsUser> findAllUser() {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
//        PageHelper.startPage(pageNum, pageSize);
        MsUserExample msUserExample = new MsUserExample();
        msUserExample.createCriteria().andUserNameEqualTo("ttl");
        msUserMapper.selectByExample(msUserExample);
        return msUserMapper.selectByExample(msUserExample);
    }
}
