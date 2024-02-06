package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Cilj;

public interface CiljRepository extends JpaRepository<Cilj, Integer> {

	@Query("SELECT c FROM Cilj c WHERE c.naziv = :naziv")
	Cilj findByNaziv(@Param("naziv") String naziv);

}
