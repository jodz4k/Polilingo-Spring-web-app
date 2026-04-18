package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BrojPrijateljaResponseDto;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repositories.ClanRepository;
import com.example.demo.repositories.PrijateljiRepository;

import model.Clan;
import model.Prijatelji;

@Service
public class PrijateljiService {
	
	@Autowired
	PrijateljiRepository pr;

	@Autowired
	ClanRepository cr;
	
	public int brojPrijateljaZaKorisnika(int idKorisnik) {
		return pr.findAllByClan1_IdClanOrClan2_IdClan(idKorisnik, idKorisnik).size();
    }
	
	public void dodajPrijatelja(int idClan1, int idClan2) {
		Optional<Clan> clan1 = cr.findById(idClan1);
		Optional<Clan> clan2 = cr.findById(idClan2);

		if (clan1.isEmpty()) {
			throw new ResourceNotFoundException("Clan", idClan1);
		}
		if (clan2.isEmpty()) {
			throw new ResourceNotFoundException("Clan", idClan2);
		}

		Prijatelji prijatelji = new Prijatelji();
		prijatelji.setClan1(clan1.get());
		prijatelji.setClan2(clan2.get());
		pr.save(prijatelji);
	}

	public void obrisiPrijatelja(int idClan1, int idClan2) {
		List<Prijatelji> prijatelji = pr.findAllByClan1_IdClanOrClan2_IdClan(idClan1, idClan1);

		for (Prijatelji jedanPrijatelj : prijatelji) {
			boolean istiRedosled = jedanPrijatelj.getClan1().getIdClan() == idClan1
					&& jedanPrijatelj.getClan2().getIdClan() == idClan2;
			boolean obrnutRedosled = jedanPrijatelj.getClan1().getIdClan() == idClan2
					&& jedanPrijatelj.getClan2().getIdClan() == idClan1;

			if (istiRedosled || obrnutRedosled) {
				pr.deleteById(jedanPrijatelj.getIdPrijatelji());
				return;
			}
		}

		throw new ResourceNotFoundException("Prijateljstvo between clans " + idClan1 + " and " + idClan2 + " not found");
	}

	public List<Integer> listaFriendsZaKorisnika(int idKorisnik) {
		List<Integer> friends = new ArrayList<>();
		List<Prijatelji> prijatelji = pr.findAllByClan1_IdClanOrClan2_IdClan(idKorisnik, idKorisnik);

		for (Prijatelji jedanPrijatelj : prijatelji) {
			if (jedanPrijatelj.getClan1().getIdClan() == idKorisnik) {
				friends.add(jedanPrijatelj.getClan2().getIdClan());
			} else {
				friends.add(jedanPrijatelj.getClan1().getIdClan());
			}
		}

		return friends;
	}

	public boolean jeSuPrijatelji(int idClan1, int idClan2) {
		List<Prijatelji> prijatelji = pr.findAllByClan1_IdClanOrClan2_IdClan(idClan1, idClan1);

		for (Prijatelji jedanPrijatelj : prijatelji) {
			boolean istiRedosled = jedanPrijatelj.getClan1().getIdClan() == idClan1
					&& jedanPrijatelj.getClan2().getIdClan() == idClan2;
			boolean obrnutRedosled = jedanPrijatelj.getClan1().getIdClan() == idClan2
					&& jedanPrijatelj.getClan2().getIdClan() == idClan1;

			if (istiRedosled || obrnutRedosled) {
				return true;
			}
		}

		return false;
	}

	public List<com.example.demo.dto.BrojPrijateljaResponseDto> getSviPrijatelji() {
		List<com.example.demo.dto.BrojPrijateljaResponseDto> rezultat = new ArrayList<>();
		List<Prijatelji> svi = pr.findAll();

		for (Prijatelji jedanPrijatelj : svi) {
			int clan1Id = jedanPrijatelj.getClan1().getIdClan();
			int clan2Id = jedanPrijatelj.getClan2().getIdClan();

			boolean clan1Postoji = false;
			for (com.example.demo.dto.BrojPrijateljaResponseDto dto : rezultat) {
				if (dto.getKorisnikId() == clan1Id) {
					clan1Postoji = true;
					break;
				}
			}

			if (!clan1Postoji) {
				int brojClan1 = brojPrijateljaZaKorisnika(clan1Id);
				rezultat.add(new com.example.demo.dto.BrojPrijateljaResponseDto(clan1Id, brojClan1));
			}
		}

		return rezultat;
	}
}