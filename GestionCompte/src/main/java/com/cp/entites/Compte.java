package com.cp.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CPTE",discriminatorType=DiscriminatorType.STRING,length=2)
public class Compte implements Serializable{

	@Id
	private String codeCpt;
	private Date dateCreation;
	private double solde;
	
	@ManyToOne
	@JoinColumn(name="CODE_CLIENT")
	private Client client;
	
	@OneToMany(mappedBy="compte")
	private Collection<Operation> operation;
	public String getCodeCpt() {
		return codeCpt;
	}
	
	
	public Compte() {
		super();
	}


	public Compte(String codeCpt, Date dateCreation, double solde, Client client) {
		super();
		this.codeCpt = codeCpt;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.client = client;
	}






	public void setCodeCpt(String codeCpt) {
		this.codeCpt = codeCpt;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Collection<Operation> getOperation() {
		return operation;
	}
	public void setOperation(Collection<Operation> operation) {
		this.operation = operation;
	}
	
}
