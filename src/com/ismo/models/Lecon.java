package com.ismo.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
@NamedQuery(name="lq1",query="from Lecon")
public class Lecon implements Serializable{

	@Id
	@GeneratedValue
	@Column(name="id_lecon")
	private int id;
	
	@Column(name="date_lecon")
	private LocalDateTime date;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_eleve")
	private Eleve eleve;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_moniteur")
	private Moniteur moniteur;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="num_voiture")
	private Voiture voiture;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	public Moniteur getMoniteur() {
		return moniteur;
	}
	public void setMoniteur(Moniteur moniteur) {
		this.moniteur = moniteur;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	@Override
	public String toString() {
		return "Lecon [id=" + id + ", date=" + date + ", eleve=" + eleve + ", moniteur=" + moniteur + ", voiture="
				+ voiture + "]";
	}
	
	
}
