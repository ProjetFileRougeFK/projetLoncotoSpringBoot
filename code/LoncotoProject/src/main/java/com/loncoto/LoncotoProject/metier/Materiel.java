package com.loncoto.LoncotoProject.metier;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Materiel {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String numeroSerie;
	@ManyToOne
	private Article article;
	@ManyToOne
	private Client proprietaire;
	@ManyToOne
	private Salle salle;
	@OneToMany
	private Set<Intervention> interventions;
}

