package com.example.demo.controllers.web;

import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.services.IzvestajService;

import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

@Controller
@RequestMapping("/izvestaj")
public class IzvestajController {

	@Autowired
	private IzvestajService izvestajService;

	@GetMapping("/jezici-pdf/{idClan}")
	public void generirajJeziciPDF(@PathVariable int idClan, HttpServletResponse response) {
		try {
			// 1. Generate report
			JasperPrint jasperReport = izvestajService.kreirajIzvestajJezika(idClan);

			// 2. Set response headers
			response.setContentType("application/pdf");
			response.addHeader("Content-disposition",
					"attachment; filename=" + izvestajService.getNazivFajla(idClan) + ".pdf");

			// 3. Export to PDF and send
			OutputStream out = response.getOutputStream();
			JasperExportManager.exportReportToPdfStream(jasperReport, out);
			out.flush();
		} catch (Exception e) {
			throw new RuntimeException("Greska pri preuzimanju PDF-a: " + e.getMessage());
		}
	}

	@GetMapping("/svi-clanovi-pdf")
	public void generirajSviClanoviPDF(HttpServletResponse response) {
		try {
			// 1. Generate report
			JasperPrint jasperReport = izvestajService.kreirajIzvestajSvihMembara();

			// 2. Set response headers
			response.setContentType("application/pdf");
			response.addHeader("Content-disposition", "attachment; filename=izvestaj_svi_clanovi.pdf");

			// 3. Export to PDF and send
			OutputStream out = response.getOutputStream();
			JasperExportManager.exportReportToPdfStream(jasperReport, out);
			out.flush();
		} catch (Exception e) {
			throw new RuntimeException("Greska pri preuzimanju PDF-a: " + e.getMessage());
		}
	}

}
