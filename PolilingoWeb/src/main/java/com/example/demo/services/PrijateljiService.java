package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repositories.ClanRepository;
import com.example.demo.repositories.PrijateljiRepository;

import model.Clan;
import model.Prijatelji;

@Service
public class PrijateljiService {
	
	@Autowired
	PrijateljiRepository pr;

	@Autowired
	ClanRepository cr;
	
	public int brojPrijateljaZaKorisnika(int idKorisnik) {
		return pr.findAllByClan1_IdClanOrClan2_IdClan(idKorisnik, idKorisnik).size();
    }
	
	public void dodajPrijatelja(int idClan1, int idClan2) {
		Optional<Clan> clan1 = cr.findById(idClan1);
		Optional<Clan> clan2 = cr.findById(idClan2);

		if (clan1.isEmpty()) {
			throw new ResourceNotFoundException("Clan", idClan1);
		}
		if (clan2.isEmpty()) {
			throw new ResourceNotFoundException("Clan", idClan2);
		}

		Prijatelji prijatelji = new Prijatelji();
		prijatelji.setClan1(clan1.get());
		prijatelji.setClan2(clan2.get());
		pr.save(prijatelji);
	}
}