package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Jezik;

@Repository
public interface JezikRepository extends JpaRepository<Jezik, Integer> {
	
	Jezik findOneByIdJezik(int jezik_id);
	
	Jezik findByNazivAndNivo(String naziv, String nivo);	
	
	
	
}
