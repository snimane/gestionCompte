package com.cp.entites;

import java.util.Date;

import javax.persistence.Entity;


@Entity
public class Versement extends Operation {

	public Versement(Date dateOp, double montant, Compte cp) {
		super(dateOp, montant, cp);
		
	}

	public Versement() {
		super();
		
	}
	
	

}
