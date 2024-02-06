package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.PrijateljiRepository;

import model.Clan;

@Service
public class PrijateljiService {
	
	@Autowired
	PrijateljiRepository pr;
	
	public int brojPrijateljaZaKorisnika(int idKorisnik) {
        return pr.brojPrijateljaZaKorisnika(idKorisnik);
    }
	
	public void dodajPrijatelja(int idClan1, int idClan2) {
		pr.dodajPrijatelja(idClan1, idClan2);
	}
}