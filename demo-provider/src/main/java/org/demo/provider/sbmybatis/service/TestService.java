package org.demo.provider.sbmybatis.service;

import java.util.List;

import org.demo.provider.sbmybatis.entity.Test;
import org.demo.provider.sbmybatis.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	private TestMapper mapper;
	
	public List<Test> findAll(){
		
		return mapper.findAll();
	}
}
