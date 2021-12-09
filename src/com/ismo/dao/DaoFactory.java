package com.ismo.dao;

public class DaoFactory {

	public static IDAO getDAO(DaoEnum type) {
		switch (type) {
		case LECON: return new DaoLecon();
		case MONITEUR: return new DaoMoniteur();
		case VOITURE: return new DaoVoiture();
		case ELEVE: return new DaoEleve();
		default:return null;
		}
	}
}
