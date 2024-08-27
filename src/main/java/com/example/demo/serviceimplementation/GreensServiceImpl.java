package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.GreensEntity;
import com.example.demo.repository.GreensRepo;
import com.example.demo.service.GreensService;

@Component
public class GreensServiceImpl implements GreensService {
	
	@Autowired
	GreensRepo repo;
	
	@Override
	public List<GreensEntity> readGreensData() {
		List<GreensEntity>findAll=repo.findAll();
		return findAll;
	}
	
	public GreensEntity createNewData(GreensEntity g) {
		GreensEntity save=repo.save(g);
		return save;
	}

	@Override
	public void deleteOneData(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public void deleteAllData() {
	  repo.deleteAll();
		
	}

}
