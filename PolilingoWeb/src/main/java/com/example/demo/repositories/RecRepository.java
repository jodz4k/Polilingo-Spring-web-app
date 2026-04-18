package com.example.demo.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Jezik;
import model.Rec;

public interface RecRepository extends JpaRepository<Rec, Integer>{
	
	List<Rec> findAllByJezik(Jezik jezik);

}


