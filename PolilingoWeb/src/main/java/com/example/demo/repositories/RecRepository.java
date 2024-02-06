package com.example.demo.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Jezik;
import model.Rec;

public interface RecRepository extends JpaRepository<Rec, Integer>{
		   
	@Query("SELECT r FROM Rec r WHERE r.naziv = :naziv")
	Rec findByNaziv(@Param("naziv") String naziv);
	
	List<Rec> findAllByJezik(Jezik jezik);

}


