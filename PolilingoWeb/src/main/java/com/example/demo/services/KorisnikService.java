package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.ClanRepository;
import com.example.demo.repositories.KorisnikRepository;

import model.Clan;
import model.Korisnik;

@Service
public class KorisnikService{
	
	@Autowired
	KorisnikRepository kr;
	
	@Autowired
	ClanRepository cr;
	
	public void saveKorisnik(Korisnik k) {
		kr.save(k);
		Clan clan = new Clan();
		clan.setKorisnik(k);
		k.addClan(clan);
		cr.save(clan);
	}
	
	public Korisnik findKorisnik(String korisnickoIme) {
		Korisnik k = new Korisnik();
		k = kr.findKorisnikbyKorisnickoIme(korisnickoIme);
		return k;
	}	
	
	public List<Korisnik> findAllClanovi(){
		return kr.findAllClanovi();
	}
}
