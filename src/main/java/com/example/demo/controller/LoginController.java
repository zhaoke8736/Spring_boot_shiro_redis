package com.example.demo.controller;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.domain.SysUser;
import com.example.demo.util.RequestUtils;

import javax.servlet.http.HttpServletRequest;
@RestController
@RequestMapping(value = "/auth")
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView submitLogin(String username, String password, HttpServletRequest request,ModelAndView modelAndView) {
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            SysUser user = (SysUser) subject.getPrincipal();
        } catch (DisabledAccountException e) {
            request.setAttribute("msg", "账户已被禁用");
            modelAndView.setViewName("login");
            return modelAndView;
        } catch (AuthenticationException e) {
            request.setAttribute("msg", "用户名或密码错误");
            modelAndView.setViewName("login");
            return modelAndView;
        }
 
        // 执行到这里说明用户已登录成功
        modelAndView.setViewName("redirect:/auth/index");
        return modelAndView;
    }
 
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView loginPage(ModelAndView modelAndView) {
    	modelAndView.setViewName("redirect:/login.jsp");
        return modelAndView;
    }
 
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView loginSuccessMessage(HttpServletRequest request,ModelAndView modelAndView) {
        String username = "未登录";
        SysUser currentLoginUser = RequestUtils.currentLoginUser();
 
        if (currentLoginUser != null && StringUtils.isNotEmpty(currentLoginUser.getUserName())) {
            username = currentLoginUser.getUserName();
        } else {
        	modelAndView.setViewName("redirect:/auth/login");
            return modelAndView;
        }
        request.setAttribute("username", username);
        modelAndView.setViewName("index");
        return modelAndView;
    }
 
    //被踢出后跳转的页面
    @RequestMapping(value = "/kickout", method = RequestMethod.GET)
    public String kickOut() {
        return "kickout";
    }
}
