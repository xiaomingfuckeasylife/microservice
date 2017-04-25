package org.demo.provider.sbjpa;


import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatService {
	@Resource
	private CatRepository catRepository;
	
	public Object findAll(){
		return catRepository.findAll();
	}
	
	@Transactional
	public void insert(){
		Cat cat = new Cat();
		cat.setId(1);
		cat.setName("11");
		catRepository.save(cat);
	}
	
	
}
