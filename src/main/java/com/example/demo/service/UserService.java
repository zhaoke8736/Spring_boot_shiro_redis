package com.example.demo.service;


import java.util.Set;

import com.example.demo.dao.domain.SysUser;

public interface UserService {
    /***
     * 获取用户
     *
     * @param user
     * @return
     */
    SysUser getUser(SysUser user);

    /**
     * 获取用户权限
     *
     * @param userId userId
     * @return 用户权限
     */
    Set<String> findPermissionsByUserId(int userId);
}