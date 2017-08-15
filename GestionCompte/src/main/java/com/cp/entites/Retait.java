package com.cp.entites;

import java.util.Date;

import javax.persistence.*;


@Entity
@DiscriminatorValue("R")

public class Retait extends Operation{

	public Retait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retait(Date dateOp, double montant, Compte cp) {
		super(dateOp, montant, cp);
		// TODO Auto-generated constructor stub
	}
	
	

}
