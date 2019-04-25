package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.XueShenMapper;
import com.example.demo.model.XueShen;
import com.example.demo.service.XueShenService;

@Service
public class XueShenServiceImpl implements XueShenService {

	   @Autowired
	   private XueShenMapper xueShenMapper;
	
	@Override
	public List<XueShen> queryAll(XueShen xueShen) {
		return xueShenMapper.queryAll(xueShen);
	}

}
