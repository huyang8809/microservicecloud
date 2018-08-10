package com.hu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hu.springcloud.entities.Dept;
import com.hu.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {

	@Autowired
	private	DeptClientService service; 
	
	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		return service.add(dept);
	}
	
	@RequestMapping(value="/consumer/dept/list")
	public List<Dept> list(){
		return service.list();
	}
	
	@RequestMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}
}
