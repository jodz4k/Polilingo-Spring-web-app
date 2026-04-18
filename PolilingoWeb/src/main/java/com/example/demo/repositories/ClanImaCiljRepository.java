package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.ClanImaCilj;
import model.ClanImaCiljPK;

public interface ClanImaCiljRepository extends JpaRepository<ClanImaCilj, ClanImaCiljPK> {

	List<ClanImaCilj> findAllByClan_Korisnik_IdKorisnik(int korisnikId);

	
}
