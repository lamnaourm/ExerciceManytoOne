package com.ismo.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
@NamedQuery(name="mq1",query="from Moniteur")
public class Moniteur {

	@Id
	@GeneratedValue
	@Column(name="id_moniteur")
	private int id;
	
	@Column(name="nom_moniteur")
	private String nom;
	
	@Column(name="prenom_moniteur")
	private String prenom;
	
	@Column(name="date_naissance")
	private LocalDate datenaissance;
	
	@Column
	private String sexe;
	
	@OneToMany(mappedBy="moniteur", fetch=FetchType.EAGER)
	private List<Lecon> lecons;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(LocalDate datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public List<Lecon> getLecons() {
		return lecons;
	}
	public void setLecons(List<Lecon> lecons) {
		this.lecons = lecons;
	}
	@Override
	public String toString() {
		return "Moniteur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", datenaissance=" + datenaissance
				+ ", sexe=" + sexe + "]";
	}
	
}
