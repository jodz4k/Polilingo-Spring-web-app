package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik, Integer> {
	
	// SELECT * FROM Korisnik WHERE korisnickoIme = 'jovan';
	@Query("select k from Korisnik k where k.korisnickoIme = :korisnickoIme")
	Korisnik findKorisnikbyKorisnickoIme(@Param("korisnickoIme") String korisnickoIme);
	
	@Query("SELECT k FROM Korisnik k WHERE k.tipKorisnika = 'clan'")
    List<Korisnik> findAllClanovi();
}
