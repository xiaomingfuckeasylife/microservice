package org.demo.provider;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class JspController {
	
	@RequestMapping("test1")
	public String run1(Map<String,Object> map){
		map.put("hello", "xiaoming");
		return "index";
	}
}
