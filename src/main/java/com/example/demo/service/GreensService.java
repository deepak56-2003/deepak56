package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.GreensEntity;

@Service
public interface GreensService {
	//get
	List<GreensEntity> readGreensData();
	//post
	GreensEntity createNewData(@RequestBody GreensEntity g); 
	//delete
	void deleteOneData(int id);
	void deleteAllData();

}
