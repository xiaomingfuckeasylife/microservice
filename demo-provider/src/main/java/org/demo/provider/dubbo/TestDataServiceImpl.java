package org.demo.provider.dubbo;

import org.demo.api.TestDataService;
import org.demo.provider.sbmybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class TestDataServiceImpl implements TestDataService{
	
	@Autowired
	private TestService testService;
	
	@Override
	public Object findAll() {
		
		return testService.findAll();
	}

}
