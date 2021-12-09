package com.ismo.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Voiture {

	@Id
	@GeneratedValue
	@Column(name="num_voiture")
	private int num;
	
	@Column
	private String modele;
	
	@Column
	private String couleur;
	
	@Column(name="date_mise_circulation")
	private LocalDate date;
	
	@OneToMany(mappedBy="voiture", fetch=FetchType.LAZY)
	private List<Lecon> lecons;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<Lecon> getLecons() {
		return lecons;
	}
	public void setLecons(List<Lecon> lecons) {
		this.lecons = lecons;
	}
	@Override
	public String toString() {
		return "Voiture [num=" + num + ", modele=" + modele + ", couleur=" + couleur + ", date=" + date + "]";
	}	
	
	
}
