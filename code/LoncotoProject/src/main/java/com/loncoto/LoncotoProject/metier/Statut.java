package com.loncoto.LoncotoProject.metier;

public enum Statut {

	arealiser("à réaliser"),finie("finie"),encours("en cours"),reportee("reportée");
	
	private String nom;
	
	public String getNom() {
		return this.nom;
	}
	
	private Statut(String name) {
		this.nom=name;
	}


}
