package com.loncoto.LoncotoProject.metier;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter@Setter@NoArgsConstructor@ToString
public class Site {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
@Id								private int id;
@Column(length=50)				private String nom;
@ManyToMany(mappedBy="sites")	private Set<Client> clients;

}

