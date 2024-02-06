package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.JezikRepository;
import com.example.demo.repositories.RecRepository;

import model.Jezik;
import model.Rec;

@Service
public class AdministratorService {
	
	@Autowired
	RecRepository rr;
	
	@Autowired
	JezikRepository jr; 
	
	public void saveRec(Rec rec) {
		rr.save(rec);
	}
	
	/*
	 * pronalazi jezik uz pomocIda
	 */
	public Jezik findJezik(Integer jezikId) {

		try {
	        return jr.findOneByIdJezik(jezikId.intValue());
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	
	public void saveJezik(Jezik jezik) {
		jr.save(jezik);
	}
	

}
