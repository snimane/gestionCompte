package com.cp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cp.entites.Operation;

public interface IOperation extends JpaRepository<Operation, Long> {

}
