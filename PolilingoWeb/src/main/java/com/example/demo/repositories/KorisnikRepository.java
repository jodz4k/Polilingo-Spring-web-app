package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik, Integer> {

	Korisnik findByKorisnickoIme(String korisnickoIme);
}
