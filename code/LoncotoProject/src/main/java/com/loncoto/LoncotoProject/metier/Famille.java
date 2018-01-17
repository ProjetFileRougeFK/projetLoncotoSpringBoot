package com.loncoto.LoncotoProject.metier;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString(exclude={"sousFamilles"})
public class Famille {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id private int id;
	@Column(length=100) private String libelle;
	
	 @OneToMany
	 private Set<SousFamille> sousFamilles;
}

