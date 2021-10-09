package fr.eni.TPJTodoList.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lieu {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String libelle;

	public Lieu(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	
	public Lieu(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	public Lieu() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
