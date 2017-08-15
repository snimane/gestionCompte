package com.cp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cp.entites.Client;


public interface IClientRepo extends JpaRepository<Client, Long> {
	
	@Query("select c from Client c where c.nom like :x")
	public List<Client> ClientByMC(@Param("x")String mc);

}
