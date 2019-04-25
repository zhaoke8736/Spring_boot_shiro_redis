package com.example.demo.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.domain.SysUser;
import com.example.demo.service.UserService;
import com.example.demo.util.RequestUtils;

import java.util.Set;


@Controller
@RequestMapping(value = "/music")
public class MusicInfoController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @RequiresPermissions({"/usersPage"})
    @ResponseBody
    public String login(){
        SysUser user = RequestUtils.currentLoginUser();
        Set<String> authorization = userService.findPermissionsByUserId(user.getId());
        return "该用户有如下权限" + authorization;
    }

}