package model;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the clan_uci_jezik database table.
 * 
 */
@Embeddable
public class ClanUciJezikPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idClan_uci_jezik;

	@Column(insertable=false, updatable=false)
	private int jezik_idJezik;

	public ClanUciJezikPK() {
	}
	public int getIdClan_uci_jezik() {
		return this.idClan_uci_jezik;
	}
	public void setIdClan_uci_jezik(int idClan_uci_jezik) {
		this.idClan_uci_jezik = idClan_uci_jezik;
	}
	public int getJezik_idJezik() {
		return this.jezik_idJezik;
	}
	public void setJezik_idJezik(int jezik_idJezik) {
		this.jezik_idJezik = jezik_idJezik;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ClanUciJezikPK)) {
			return false;
		}
		ClanUciJezikPK castOther = (ClanUciJezikPK)other;
		return 
			(this.idClan_uci_jezik == castOther.idClan_uci_jezik)
			&& (this.jezik_idJezik == castOther.jezik_idJezik);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idClan_uci_jezik;
		hash = hash * prime + this.jezik_idJezik;
		
		return hash;
	}
}