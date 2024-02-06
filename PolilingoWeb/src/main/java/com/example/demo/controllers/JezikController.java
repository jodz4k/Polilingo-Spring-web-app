package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.JezikService;

import model.Jezik;

@Controller
@RequestMapping(value = "/jezik")
public class JezikController {
	@Autowired
	JezikService jezikService;

	@GetMapping("/ispisiJezike")
	public String ispisiJezike(Model model) {
		List<Jezik> jezici = jezikService.findAllJezike();
		model.addAttribute("jezici", jezici);
		return "admPregledJezika";
	}
	
	@GetMapping("/ispisiJezikeZaClanove")
	public String ispisiJezikeZaClanove(Model model) {
		List<Jezik> jezici = jezikService.findAllJezike();
		model.addAttribute("jezici", jezici);
		return "clanPregledJezika";
	}
	
	@PostMapping("/obrisiJezik")
    public String obrisiJezik(@RequestParam("jezikId") int jezikId) {
        jezikService.deleteJezik(jezikId);

        // Redirektuj na stranicu za pregled jezika
        return "administrator";
    }
}
