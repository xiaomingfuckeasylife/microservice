package org.demo.provider.sbmybatis.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.demo.entity.demo.Test;

public interface TestMapper {

	@Select("select * from Test")
	public List<Test> findAll();
}	
