package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Prijatelji;

public interface PrijateljiRepository extends JpaRepository<Prijatelji, Integer> {

	List<Prijatelji> findAllByClan1_IdClanOrClan2_IdClan(int clanId1, int clanId2);

}
