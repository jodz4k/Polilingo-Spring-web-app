package com.example.demo.repositories;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Clan;

public interface ClanRepository extends JpaRepository<Clan, Integer>{
	
	 @Query("INSERT INTO ClanUciJezik (clan, jezik) VALUES (:clanId, :jezikId)")
	 void spojiClanaSaJezikomPoIDu(@Param("clanId") Integer clanId, @Param("jezikId") Integer jezikId);
	 
	 Clan findByKorisnik_KorisnickoIme(String korisnickoIme);
	 
//	 @Query("INSERT INTO clan_ima_cilj (Clan_idClan, Cilj_idCilj, jeIspunjen, pocetak, zavrsetak) " +
//		       "VALUES (:clanId, :ciljId, 0, :pocetakDatum, :zavrsetakDatum)")
//	 void dodajCiljClanu(@Param("clanId") Integer clanId, 
//		                    @Param("ciljId") Integer ciljId, 
//		                    @Param("pocetakDatum") LocalDate pocetakDatum, 
//		                    @Param("zavrsetakDatum") LocalDate zavrsetakDatum);
	 
	 

}
