package com.loncoto.LoncotoProject.metier;


import java.util.Set;

import javax.persistence.Column;
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
@Getter @Setter @NoArgsConstructor @ToString(exclude={"articles"})
public class SousFamille {
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Id private int id;
		@Column(length=100) private String libelle;
		
		@OneToMany
		private Set<Article> articles;
		
		@ManyToOne
		private Famille famille;
}
