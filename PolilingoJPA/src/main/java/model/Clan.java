package model;

import java.io.Serializable;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the clan database table.
 * 
 */
@Entity
@NamedQuery(name="Clan.findAll", query="SELECT c FROM Clan c")
public class Clan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idClan;

	//bi-directional many-to-one association to Korisnik
	@ManyToOne
	private Korisnik korisnik;

	//bi-directional many-to-one association to ClanImaCilj
	@OneToMany(mappedBy="clan")
	private List<ClanImaCilj> clanImaCiljs;

	//bi-directional many-to-one association to ClanUciJezik
	@OneToMany(mappedBy="clan")
	private List<ClanUciJezik> clanUciJeziks;

	//bi-directional many-to-one association to Prijatelji
	@OneToMany(mappedBy="clan1")
	private List<Prijatelji> prijateljis1;

	//bi-directional many-to-one association to Prijatelji
	@OneToMany(mappedBy="clan2")
	private List<Prijatelji> prijateljis2;

	public Clan() {
		this.clanImaCiljs = new ArrayList<ClanImaCilj>();
		this.clanUciJeziks = new ArrayList<ClanUciJezik>();
		this.prijateljis2 = new ArrayList<Prijatelji>();
	}

	public int getIdClan() {
		return this.idClan;
	}

	public void setIdClan(int idClan) {
		this.idClan = idClan;
	}

	public Korisnik getKorisnik() {
		return this.korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public List<ClanImaCilj> getClanImaCiljs() {
		return this.clanImaCiljs;
	}

	public void setClanImaCiljs(List<ClanImaCilj> clanImaCiljs) {
		this.clanImaCiljs = clanImaCiljs;
	}

	public ClanImaCilj addClanImaCilj(ClanImaCilj clanImaCilj) {
		getClanImaCiljs().add(clanImaCilj);
		clanImaCilj.setClan(this);

		return clanImaCilj;
	}

	public ClanImaCilj removeClanImaCilj(ClanImaCilj clanImaCilj) {
		getClanImaCiljs().remove(clanImaCilj);
		clanImaCilj.setClan(null);

		return clanImaCilj;
	}

	public List<ClanUciJezik> getClanUciJeziks() {
		return this.clanUciJeziks;
	}

	public void setClanUciJeziks(List<ClanUciJezik> clanUciJeziks) {
		this.clanUciJeziks = clanUciJeziks;
	}

	public ClanUciJezik addClanUciJezik(ClanUciJezik clanUciJezik) {
		getClanUciJeziks().add(clanUciJezik);
		clanUciJezik.setClan(this);

		return clanUciJezik;
	}

	public ClanUciJezik removeClanUciJezik(ClanUciJezik clanUciJezik) {
		getClanUciJeziks().remove(clanUciJezik);
		clanUciJezik.setClan(null);

		return clanUciJezik;
	}

	public List<Prijatelji> getPrijateljis1() {
		return this.prijateljis1;
	}

	public void setPrijateljis1(List<Prijatelji> prijateljis1) {
		this.prijateljis1 = prijateljis1;
	}

	public Prijatelji addPrijateljis1(Prijatelji prijateljis1) {
		getPrijateljis1().add(prijateljis1);
		prijateljis1.setClan1(this);

		return prijateljis1;
	}

	public Prijatelji removePrijateljis1(Prijatelji prijateljis1) {
		getPrijateljis1().remove(prijateljis1);
		prijateljis1.setClan1(null);

		return prijateljis1;
	}

	public List<Prijatelji> getPrijateljis2() {
		return this.prijateljis2;
	}

	public void setPrijateljis2(List<Prijatelji> prijateljis2) {
		this.prijateljis2 = prijateljis2;
	}

	public Prijatelji addPrijateljis2(Prijatelji prijateljis2) {
		getPrijateljis2().add(prijateljis2);
		prijateljis2.setClan2(this);

		return prijateljis2;
	}

	public Prijatelji removePrijateljis2(Prijatelji prijateljis2) {
		getPrijateljis2().remove(prijateljis2);
		prijateljis2.setClan2(null);

		return prijateljis2;
	}

}