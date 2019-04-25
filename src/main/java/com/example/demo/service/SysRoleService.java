package com.example.demo.service;

import java.util.Set;

public interface SysRoleService {
    Set<String> findRoleNameByUserId(int userId);
}