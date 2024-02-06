package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.services.AdministratorService;

import model.Jezik;
import model.Rec;

@Controller
@RequestMapping(value = "/administrator")
public class AdministratorController {
	
	@Autowired
	AdministratorService as;
	
	@PostMapping("/saveRec")
	public String saveRec(String naziv, String tezina, String opis, String kontekst, Integer idJezik) {
	    Rec rec = new Rec();
	    rec.setNaziv(naziv);
	    rec.setTezina(tezina);
	    rec.setOpis(opis);
	    rec.setKontekst(kontekst);
	    
	    System.out.println(naziv + " " +kontekst +  " ");

	    Jezik jezik = as.findJezik(idJezik);
	    rec.setJezik(jezik);

	    as.saveRec(rec);

	    return "administrator";
	}
	
	@PostMapping("/saveJezik")
	public String saveJezik(Jezik jezik){
		as.saveJezik(jezik);
		return"administrator";
	}

}