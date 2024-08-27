package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.GreensEntity;
import com.example.demo.serviceimplementation.GreensServiceImpl;

@RestController
public class GreensController {

	@Autowired
	GreensServiceImpl imp;

	@GetMapping(value = "/fire")

	public List<GreensEntity> getData() {
		List<GreensEntity> readGreensData = imp.readGreensData();
		return readGreensData;
	}

	@PostMapping(value = "/create1")
	public Object postData(@RequestBody GreensEntity g) {
		GreensEntity CreateNewData = imp.createNewData(g);
		return new ResponseEntity<>(CreateNewData,HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteDataBy(@PathVariable int id) {
		imp.deleteOneData(id);
	}

	@DeleteMapping(value = "/delete")
	public void deleteData() {
		imp.deleteAllData();
	}

}
