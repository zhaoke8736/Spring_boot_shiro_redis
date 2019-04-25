package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SysRoleMapper;
import com.example.demo.service.SysRoleService;

import java.util.Set;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public Set<String> findRoleNameByUserId(int userId) {
        return sysRoleMapper.findRoleNameByUserId(userId);
    }
}