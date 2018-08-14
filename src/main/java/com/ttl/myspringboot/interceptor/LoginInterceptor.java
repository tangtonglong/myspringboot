package com.ttl.myspringboot.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author Tangtl
 * @program: myspringboot
 * @Package com.ttl.myspringboot.interceptor
 * @Title: LoginInterceptor
 * @Description:
 * @date 2018-07-30  11:19
 */
@SuppressWarnings("ALL")
public class LoginInterceptor implements HandlerInterceptor {

    private static Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @SuppressWarnings("AlibabaUndefineMagicConstant")
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("执行 preHandle");
        String uri = request.getRequestURI();

        logger.info(uri);

        //noinspection AlibabaUndefineMagicConstant,AlibabaUndefineMagicConstant
        if(uri.indexOf("/user/register")>=0 || uri.indexOf("/user/login")>=0){
            //如果进行登陆/注册则放行
            return true;
        }else {
            return true;
            //判断token
//            String token = request.getParameter("token");
//            //用户未登录
//            if("".equals(token) || token==null){
//                SendMessageUtil.sendJsonMessage(response);
//                return false;
//            }else{
//                //校验token
//                Map<String, Object> map = javaWebToken.parserJavaWebToken(token);
//                if(map==null){
//                    SendMessageUtil.sendJsonMessage(response);
//                    return false; //token过期
//                }else{
//                    String userId = map.get("userIdCrm").toString();
//                    if(jedisCluster.get(userId)==null || !jedisCluster.get(userId).equals(token)){
//                        SendMessageUtil.sendJsonMessage(response);
//                        return false; //token值改变
//                    }else{
//                        request.setAttribute("userId",userId);
//                        return true;
//                    }
//                }
//            }
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("执行 postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("执行 afterCompletion");
    }
}
