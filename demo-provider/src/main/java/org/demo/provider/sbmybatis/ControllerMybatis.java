package org.demo.provider.sbmybatis;

import java.util.List;

import org.demo.entity.demo.Test;
import org.demo.provider.sbmybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/my")
public class ControllerMybatis {

	@Autowired
	private TestService service;
	
	@RequestMapping("/test")
	@ResponseBody
	public List<Test> findAll(){
		
		return service.findAll();
	}
}
