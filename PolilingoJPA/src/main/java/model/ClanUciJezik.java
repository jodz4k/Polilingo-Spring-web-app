package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the clan_uci_jezik database table.
 * 
 */
@Entity
@Table(name="clan_uci_jezik")
@NamedQuery(name="ClanUciJezik.findAll", query="SELECT c FROM ClanUciJezik c")
public class ClanUciJezik implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ClanUciJezikPK id;

	//bi-directional many-to-one association to Clan
	@ManyToOne
	private Clan clan;

	//bi-directional many-to-one association to Jezik
	@ManyToOne
	private Jezik jezik;

	public ClanUciJezik() {
	}

	public ClanUciJezikPK getId() {
		return this.id;
	}

	public void setId(ClanUciJezikPK id) {
		this.id = id;
	}

	public Clan getClan() {
		return this.clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public Jezik getJezik() {
		return this.jezik;
	}

	public void setJezik(Jezik jezik) {
		this.jezik = jezik;
	}

}