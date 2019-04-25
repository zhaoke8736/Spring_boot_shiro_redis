package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SysResourcesMapper;
import com.example.demo.dao.domain.SysResources;
import com.example.demo.service.ResourcesService;

import java.util.List;

@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    @Override
    public List<SysResources> selectAll() {
        List<SysResources> resourcesList = sysResourcesMapper.selectAll();
        return resourcesList;
    }
}