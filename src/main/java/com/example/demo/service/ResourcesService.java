package com.example.demo.service;


import java.util.List;

import com.example.demo.dao.domain.SysResources;

public interface ResourcesService {
    List<SysResources> selectAll();
}