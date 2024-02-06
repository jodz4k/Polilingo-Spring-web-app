package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.RecService;

import model.Rec;

@Controller
@RequestMapping(value = "/rec")
public class RecController {
	
	@Autowired
	RecService rs;
	
	@PostMapping("/deleteRec")
    public String deleteRec(@RequestParam String naziv) {
        Rec recToDelete = rs.findRecByNaziv(naziv);
       // System.out.println(recToDelete.getIdRec());

        rs.deleteRecById(recToDelete.getIdRec());
        
        return "administrator";
    }
}
