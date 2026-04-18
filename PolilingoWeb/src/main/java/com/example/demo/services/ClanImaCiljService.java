package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.ClanImaCiljRepository;

import model.ClanImaCilj;

@Service
public class ClanImaCiljService {
	
	@Autowired
	private ClanImaCiljRepository ccr;
	
	public int getBrojClanImaCilj(int korisnikId) {
		List<ClanImaCilj> ciljevi = ccr.findAllByClan_Korisnik_IdKorisnik(korisnikId);
		int brojIspunjenih = 0;
		for (ClanImaCilj cilj : ciljevi) {
			if (cilj.getJeIspunjen() == 1) {
				brojIspunjenih++;
			}
		}
		return brojIspunjenih;
	}
}
