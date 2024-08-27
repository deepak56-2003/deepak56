package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.GreensEntity;

@Component

public interface GreensRepo extends JpaRepository<GreensEntity,Integer>{

}
