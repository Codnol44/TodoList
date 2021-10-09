package fr.eni.TPJTodoList.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Todo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private String delai;
	
	@OneToOne
	private Lieu lieu;
	
	public Todo(Long id, String description, String delai, Lieu lieu) {
		super();
		this.id = id;
		this.description = description;
		this.delai = delai;
	}
	
	public Todo(Long id, String description, String delai) {
		super();
		this.id = id;
		this.description = description;
		this.delai = delai;
	}
	
	public Todo(String description, String delai) {
		super();
		this.description = description;
		this.delai = delai;
	}
	
	public Todo() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDelai() {
		return delai;
	}

	public void setDelai(String delai) {
		this.delai = delai;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

}
