package com.cp.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OPT",discriminatorType=DiscriminatorType.STRING,length=2)
public class Operation implements Serializable {
	
	@Id
	@GeneratedValue
	private Long numOp;
	private Date dateOp;
	private double montant;

	@ManyToOne
	@JoinColumn(name="CODE_CPT")
	private Compte cp;
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Operation( Date dateOp, double montant, Compte cp) {
		super();

		this.dateOp = dateOp;
		this.montant = montant;
		this.cp = cp;
	}
	public Long getNumOp() {
		return numOp;
	}
	public void setNumOp(Long numOp) {
		this.numOp = numOp;
	}
	public Date getDateOp() {
		return dateOp;
	}
	public void setDateOp(Date dateOp) {
		this.dateOp = dateOp;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Compte getCp() {
		return cp;
	}
	public void setCp(Compte cp) {
		this.cp = cp;
	}
	

}
