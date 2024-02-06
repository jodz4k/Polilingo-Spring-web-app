package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.ClanImaCiljService;
import com.example.demo.services.ClanUciJezikService;
import com.example.demo.services.JezikService;
import com.example.demo.services.KorisnikService;
import com.example.demo.services.PrijateljiService;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;
import model.Korisnik;

@Controller
@RequestMapping(value = "/korisnik")
public class KorisnikController {

	@Autowired
	KorisnikService kr;

	@Autowired
	JezikService jezikService;

	@Autowired
	ClanImaCiljService clanImaCiljService;

	@Autowired
	PrijateljiService prijateljiService;

	@Autowired
	PasswordEncoder passwordEncoder;

	@RequestMapping("/login")
	public String loginKorisnik() {
		System.out.println("POZIVA ME!!!!!");
		return "login";
	}

	@PostMapping("/loginSession")
	public String loginSession(String korisnickoIme, String password, HttpSession session) {
		session.setAttribute("korisnickoIme", korisnickoIme);
		session.setAttribute("password", password);
		return "redirect:/nakonLogin";
	}

	@PostMapping("/saveKorisnik")
	public String saveKorisnik(String korisnickoIme, String mail, String password) {
		/*
		 * moze se ubaciti provera da li su isti passwordi
		 */

		Korisnik k = new Korisnik();
		k.setKorisnickoIme(korisnickoIme);
		k.setMail(mail);
		k.setPassword(passwordEncoder.encode(password));
		k.setTipKorisnika("clan");

		kr.saveKorisnik(k);
		return "redirect:/index.jsp";
	}

	/*
	 * proverava da li se poklapa lozinka, pa onda nick, ako ni[ta ostaje na istoj
	 * stranici
	 */
	@GetMapping("/nakonLogin")
	public String loginKorisnik(@RequestParam String korisnickoIme, @RequestParam String password, HttpSession session, Model model) {
	    if (kr.findKorisnik(korisnickoIme) != null && passwordEncoder.matches(password, kr.findKorisnik(korisnickoIme).getPassword())) {
	        session.setAttribute("korisnickoIme", korisnickoIme);
	    }
	        
	        if(kr.findKorisnik(korisnickoIme).getTipKorisnika().equals("clan")){
	        	System.out.println(1);
	        	
	        	Korisnik korisnik = kr.findKorisnik(korisnickoIme);

				model.addAttribute("korisnickoIme", korisnik.getKorisnickoIme());
				model.addAttribute("brPrijatelja", prijateljiService.brojPrijateljaZaKorisnika(korisnik.getIdKorisnik()));
				model.addAttribute("ispisaniJeziciKojeUci", jezikService.getJezikeKorisnika(korisnik.getIdKorisnik()));
				model.addAttribute("ispunjenihCiljeva", clanImaCiljService.getBrojClanImaCilj(korisnik.getIdKorisnik()));
	        	
	        	
	            return "clan";  
	        } else if (kr.findKorisnik(korisnickoIme).getTipKorisnika().equals("administrator")) {
	        	System.out.println(2);
	            return "administrator";
	        }
	    return "login";
	}

}