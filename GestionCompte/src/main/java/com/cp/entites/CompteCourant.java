package com.cp.entites;

import java.util.Date;

import javax.persistence.*;


@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte{
	
	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public CompteCourant(double decouvert) {
	
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		
	}

	public CompteCourant(String codeCpt, Date dateCreation, double solde, Client client) {
		super(codeCpt, dateCreation, solde, client);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
