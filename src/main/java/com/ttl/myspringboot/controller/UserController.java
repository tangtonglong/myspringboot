package com.ttl.myspringboot.controller;

import com.ttl.myspringboot.po.MsUser;
import com.ttl.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Tangtl
 * @program: myspringboot
 * @Package com.ttl.myspringboot.controller
 * @Title: UserController
 * @Description:
 * @date 2018-07-27  11:49
 */
@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "getUser", method = RequestMethod.POST)
    @ResponseBody
    public List<MsUser> getUser() {

        return userService.findAllUser();
    }

}
