package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.ClanRepository;

import model.Clan;

@Service
public class ClanService {
	
	@Autowired
	private ClanRepository cr;
	
	public Clan findByKorisnickoIme(String korisnickoIme) {
		return cr.findByKorisnik_KorisnickoIme(korisnickoIme);
	}
}
