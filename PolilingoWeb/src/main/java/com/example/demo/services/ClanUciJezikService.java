package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.ClanUciJezikRepository;

import model.ClanUciJezik;

@Service
public class ClanUciJezikService {
	
	@Autowired
	ClanUciJezikRepository cujr;
	
	public void saveClanUciJezik(ClanUciJezik clanUciJezik) {
		cujr.save(clanUciJezik);
	}
	
	public int getNewID() {
		return 0;
	}
}
