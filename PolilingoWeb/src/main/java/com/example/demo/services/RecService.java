package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.RecRepository;

import model.Jezik;
import model.Rec;

@Service
public class RecService {
	
	@Autowired
	RecRepository rr;
	
	public Rec findRecByNaziv(String naziv) {
		return rr.findByNaziv(naziv);
	}
	
	public void deleteRec(Rec rec) {
		rr.delete(rec);
	}
	
	public void deleteRecById(int id) {
		rr.deleteById(id);
	}
	
	public List<Rec> findAllByJezik(Jezik jezik){
		return rr.findAllByJezik(jezik);
	}
}
