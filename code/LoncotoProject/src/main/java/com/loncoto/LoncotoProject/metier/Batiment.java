package com.loncoto.LoncotoProject.metier;


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
@Getter@Setter@NoArgsConstructor@ToString
public class Batiment {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
@Id					private int id;
@Column(length=50)	private String nom;
@ManyToOne			private Site batimentSite;
	

}

