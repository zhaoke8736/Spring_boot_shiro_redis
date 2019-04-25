package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.XueShenMapper;
import com.example.demo.model.XueShen;
import com.example.demo.service.XueShenService;

@RestController
@RequestMapping("/Test")
public class XueShenController {

	 @Autowired
	    private XueShenService xueShenService;
	    @RequestMapping("/queryAll")
	    public List<XueShen> queryAll(XueShen xueShen) {
	           return xueShenService.queryAll(xueShen);
	    }


  
}
