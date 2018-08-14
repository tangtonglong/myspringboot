package com.ttl.myspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @author Tangtl
 * @program: myspringboot
 * @Package com.ttl.myspringboot.controller
 * @Title: UidController
 * @Description:
 * @date 2018-08-13  11:15
 */
@RequestMapping(value = "uid")
@RestController
public class UidController {

    @RequestMapping("/getUid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        session.getLastAccessedTime();
        session.setMaxInactiveInterval(3);
        return session.getId();
    }
}
