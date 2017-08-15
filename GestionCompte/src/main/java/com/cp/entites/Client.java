package com.cp.entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
@Entity
public class Client implements Serializable{
	public Client(String nom) {
		super();
		this.nom = nom;
	}
	@Id @GeneratedValue
	private Long code;
	private String nom;

	@OneToMany(mappedBy="client")
	private Collection<Compte> cpts;
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<Compte> getCpts() {
		return cpts;
	}
	public void setCpts(Collection<Compte> cpts) {
		this.cpts = cpts;
	}
	public Client() {
		super();
	}
	public Client(Long code, String nom, Collection<Compte> cpts) {
		super();
		this.code = code;
		this.nom = nom;
		this.cpts = cpts;
	}
	public Client(Long code) {
		super();
		this.code = code;
	}
	
	

}
