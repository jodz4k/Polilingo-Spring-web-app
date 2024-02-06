package model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the rec database table.
 * 
 */
@Entity
@NamedQuery(name="Rec.findAll", query="SELECT r FROM Rec r")
public class Rec implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRec;

	private String kontekst;

	private String naziv;

	private String opis;

	private String tezina;

	//bi-directional many-to-one association to Jezik
	@ManyToOne
	private Jezik jezik;

	//bi-directional many-to-one association to ClanImaCiljKojiPosedujeReci
	// @OneToMany(mappedBy="rec")
	// private List<ClanImaCiljKojiPosedujeReci> clanImaCiljKojiPosedujeRecis;

	public Rec() {
	}
	
	@Override
	public String toString() {
		return " " + kontekst + ", " + naziv + ", " + opis + ", " + tezina + ", "
				+ jezik + " ";
	}

	public int getIdRec() {
		return this.idRec;
	}

	public void setIdRec(int idRec) {
		this.idRec = idRec;
	}

	public String getKontekst() {
		return this.kontekst;
	}

	public void setKontekst(String kontekst) {
		this.kontekst = kontekst;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getTezina() {
		return this.tezina;
	}

	public void setTezina(String tezina) {
		this.tezina = tezina;
	}

	public Jezik getJezik() {
		return this.jezik;
	}

	public void setJezik(Jezik jezik) {
		this.jezik = jezik;
	}

//	public List<ClanImaCiljKojiPosedujeReci> getClanImaCiljKojiPosedujeRecis() {
//		return this.clanImaCiljKojiPosedujeRecis;
//	}
//
//	public void setClanImaCiljKojiPosedujeRecis(List<ClanImaCiljKojiPosedujeReci> clanImaCiljKojiPosedujeRecis) {
//		this.clanImaCiljKojiPosedujeRecis = clanImaCiljKojiPosedujeRecis;
//	}
//
//	public ClanImaCiljKojiPosedujeReci addClanImaCiljKojiPosedujeReci(ClanImaCiljKojiPosedujeReci clanImaCiljKojiPosedujeReci) {
//		getClanImaCiljKojiPosedujeRecis().add(clanImaCiljKojiPosedujeReci);
//		clanImaCiljKojiPosedujeReci.setRec(this);
//
//		return clanImaCiljKojiPosedujeReci;
//	}
//
//	public ClanImaCiljKojiPosedujeReci removeClanImaCiljKojiPosedujeReci(ClanImaCiljKojiPosedujeReci clanImaCiljKojiPosedujeReci) {
//		getClanImaCiljKojiPosedujeRecis().remove(clanImaCiljKojiPosedujeReci);
//		clanImaCiljKojiPosedujeReci.setRec(null);
//
//		return clanImaCiljKojiPosedujeReci;
//	}

}