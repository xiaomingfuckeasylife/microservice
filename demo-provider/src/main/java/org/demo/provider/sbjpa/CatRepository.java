package org.demo.provider.sbjpa;


import java.io.Serializable;

import org.demo.provider.sbjpa.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Serializable>{
	
	
	
}