package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
import model.Prijatelji;

public interface PrijateljiRepository extends JpaRepository<Prijatelji, Integer> {

	 @Query("SELECT COUNT(p) FROM Prijatelji p WHERE p.clan1.idClan = :korisnikId OR p.clan2.idClan = :korisnikId")
	 int brojPrijateljaZaKorisnika(@Param("korisnikId") int korisnikId);
	 
//	 @Transactional
//	 @Modifying
	 @Query(value = "INSERT INTO prijatelji (clan_idClan, clan_idClan1) VALUES (:idClan1, :idClan2)", nativeQuery = true)
	 void dodajPrijatelja(Integer idClan1, Integer idClan2);

}