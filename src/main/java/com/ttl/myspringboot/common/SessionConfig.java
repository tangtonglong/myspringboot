package com.ttl.myspringboot.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author Tangtl
 * @program: myspringboot
 * @Package com.ttl.myspringboot.common
 * @Title: SessionConfig
 * @Description: maxInactiveIntervalInSeconds: 设置Session失效时间，使用Redis Session之后，原Boot的server.session.timeout属性不再生效
 * @date 2018-08-13  10:35
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)
public class SessionConfig {
}
