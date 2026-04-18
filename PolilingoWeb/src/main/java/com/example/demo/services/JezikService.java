package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.ClanUciJezikRepository;
import com.example.demo.repositories.JezikRepository;
import model.ClanUciJezik;
import model.Jezik; // Dodao sam import za Jezik entitet

import java.util.ArrayList;
import java.util.List; // Dodao sam import za java.util.List

@Service
public class JezikService {
    
    @Autowired
    private JezikRepository jr;

	@Autowired
	private ClanUciJezikRepository cujr;
    
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
        List<ClanUciJezik> sviZapisi = cujr.findAll();
        List<Jezik> jezici = new ArrayList<>();
        for (ClanUciJezik zapis : sviZapisi) {
            if (zapis.getClan() != null && zapis.getClan().getKorisnik() != null
                    && zapis.getClan().getKorisnik().getIdKorisnik() == korisnikId && zapis.getJezik() != null) {
                jezici.add(zapis.getJezik());
            }
        }
        return jezici;
    }
    
    public Jezik findByNazivAndNivo(String naziv, String nivo) {
    	return jr.findByNazivAndNivo(naziv, nivo);
    }

	public Jezik findJezikById(int selectedLanguageId) {
		return jr.findOneByIdJezik(selectedLanguageId);
	}
	
	
}
