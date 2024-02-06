package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.ClanImaCilj;

public interface ClanImaCiljRepository extends JpaRepository<ClanImaCilj, Integer> {
	
	@Query("SELECT COUNT(cic) FROM ClanImaCilj cic " +
		       "JOIN Clan c ON cic.clan.idClan = c.idClan " +
		       "JOIN Korisnik k ON c.korisnik.idKorisnik = k.idKorisnik " +
		       "WHERE k.idKorisnik = :korisnikId AND cic.jeIspunjen = :jeIspunjenValue")
		int brojIspunjenihCiljevaZaKorisnika(@Param("korisnikId") int korisnikId, @Param("jeIspunjenValue") int jeIspunjenValue);

	
}
