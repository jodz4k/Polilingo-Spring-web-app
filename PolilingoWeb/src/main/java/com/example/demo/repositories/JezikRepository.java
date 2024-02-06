package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import model.Jezik;

@Repository
public interface JezikRepository extends JpaRepository<Jezik, Integer> {
	
	Jezik findOneByIdJezik(int jezik_id);
	
	@Query("SELECT j FROM Jezik j " +
		       "JOIN ClanUciJezik cuj ON j.idJezik = cuj.jezik.idJezik " +
		       "JOIN Clan c ON cuj.clan.idClan = c.idClan " +
		       "JOIN Korisnik k ON c.korisnik.idKorisnik = k.idKorisnik " +
		       "WHERE k.idKorisnik = :korisnikId")
	List<Jezik> jeziciKojeUciClan(@Param("korisnikId") int korisnikId);
	
	Jezik findByNazivAndNivo(String naziv, String nivo);	
	
	
	
}