package com.example.demo.services;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ClanUciJezik;
import com.example.demo.repositories.ClanUciJezikRepository;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class IzvestajService {

	@Autowired
	private ClanUciJezikRepository clanUciJezikRepository;

	public JasperPrint kreirajIzvestajJezika(int idClan) {
		try {
			// 1. Get data from database - all languages the clan is learning
			List<ClanUciJezik> jeziciZaClan = clanUciJezikRepository.findAllByIdClan(idClan);
			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(jeziciZaClan);

			// 2. Load template (.jrxml)
			InputStream inputStream = this.getClass().getResourceAsStream("/jasperreport/jeziciPoCIanu.jrxml");

			// 3. Compile to JasperReport
			JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);

			// 4. Set parameters
			Map<String, Object> params = new HashMap<>();
			params.put("naslov", "Jezici koje Clan uci");

			// 5. Fill report with data
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);

			return jasperPrint;
		} catch (JRException e) {
			throw new RuntimeException("Greska pri kreiranju izvestaja: " + e.getMessage());
		}
	}

	public JasperPrint kreirajIzvestajSvihMembara() {
		try {
			// 1. Get all clan-language relationships
			List<ClanUciJezik> sviClanovi = clanUciJezikRepository.findAll();
			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(sviClanovi);

			// 2. Load template (.jrxml)
			InputStream inputStream = this.getClass().getResourceAsStream("/jasperreport/sviClanoviJezici.jrxml");

			// 3. Compile to JasperReport
			JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);

			// 4. Set parameters
			Map<String, Object> params = new HashMap<>();
			params.put("naslov", "Pregled svih članova i jezika");

			// 5. Fill report with data
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);

			return jasperPrint;
		} catch (JRException e) {
			throw new RuntimeException("Greska pri kreiranju izvestaja: " + e.getMessage());
		}
	}

	public String getNazivFajla(int idClan) {
		return "izvestaj_clan_" + idClan;
	}

}
