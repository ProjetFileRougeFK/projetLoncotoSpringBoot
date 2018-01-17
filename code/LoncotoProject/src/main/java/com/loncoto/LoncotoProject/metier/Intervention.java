package com.loncoto.LoncotoProject.metier;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Intervention {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private LocalDateTime datePlanifiee;
	private LocalDateTime dateRealisation;
	private Statut statut;
	@Column(length=400)
	private String commentaire;
	
	@ManyToOne
	private Intervenant intervenant;
	
	@ManyToOne
	private Materiel materiel;
}

