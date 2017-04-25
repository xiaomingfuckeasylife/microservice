package org.demo.provider;

import javax.annotation.Resource;

import org.demo.provider.sbjpa.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("test")
	public Demo run(){
		Demo d = new Demo();
		d.setId(1);
		d.setName("hello you  world");
		if(1 == 1)
		throw new RuntimeException();
		
		return d;
	}
	
	@Resource
	private CatService service;
	
	@RequestMapping("cat")
	public void catAdd(){
		service.insert();
	}
	
}
