package com.cp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cp.entites.Compte;

//Id de la table compte
public interface ICompte extends JpaRepository<Compte, String>{

}
