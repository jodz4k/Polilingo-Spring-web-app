package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.JezikRepository;
import model.Jezik; // Dodao sam import za Jezik entitet

import java.util.List; // Dodao sam import za java.util.List

@Service
public class JezikService {
    
    @Autowired
    private JezikRepository jr;
    
    public List<Jezik> findAllJezike() {
        return jr.findAll();
    }
    
    public void saveJezik(Jezik jezik) {
    	jr.save(jezik);
    }
    
    public void deleteJezik(int jezik){
    	jr.deleteById(jezik);
    }
    
    public List<Jezik> getJezikeKorisnika(int korisnikId) {
    	return jr.jeziciKojeUciClan(korisnikId);
    }
    
    public Jezik findByNazivAndNivo(String naziv, String nivo) {
    	return jr.findByNazivAndNivo(naziv, nivo);
    }

	public Jezik findJezikById(int selectedLanguageId) {
		return jr.findOneByIdJezik(selectedLanguageId);
	}
	
	
}
