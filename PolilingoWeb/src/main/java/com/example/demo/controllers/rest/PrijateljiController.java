package com.example.demo.controllers.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BrojPrijateljaResponseDto;
import com.example.demo.dto.DodajPrijateljaRequestDto;
import com.example.demo.services.PrijateljiService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/prijatelji")
public class PrijateljiController {

    @Autowired
    private PrijateljiService prijateljiService;

    @GetMapping("/broj/{korisnikId}")
    public BrojPrijateljaResponseDto brojPrijateljaZaKorisnika(@PathVariable int korisnikId) {
        int brojPrijatelja = prijateljiService.brojPrijateljaZaKorisnika(korisnikId);
        return new BrojPrijateljaResponseDto(korisnikId, brojPrijatelja);
    }

    @PostMapping("/dodaj")
    public ResponseEntity<Void> dodajPrijatelja(@Valid @RequestBody DodajPrijateljaRequestDto request) {
        prijateljiService.dodajPrijatelja(request.getIdClan1(), request.getIdClan2());
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/obrisi/{idClan1}/{idClan2}")
    public ResponseEntity<Void> obrisiPrijatelja(@PathVariable int idClan1, @PathVariable int idClan2) {
        prijateljiService.obrisiPrijatelja(idClan1, idClan2);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/lista/{korisnikId}")
    public List<Integer> listaFriendsZaKorisnika(@PathVariable int korisnikId) {
        return prijateljiService.listaFriendsZaKorisnika(korisnikId);
    }

    @GetMapping("/provera/{idClan1}/{idClan2}")
    public boolean proveraFriendship(@PathVariable int idClan1, @PathVariable int idClan2) {
        return prijateljiService.jeSuPrijatelji(idClan1, idClan2);
    }

    @GetMapping("/sve")
    public List<BrojPrijateljaResponseDto> sviPrijatelji() {
        return prijateljiService.getSviPrijatelji();
    }
}
