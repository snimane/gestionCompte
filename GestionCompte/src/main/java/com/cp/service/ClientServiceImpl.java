package com.cp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.entites.Client;
import com.cp.repository.IClientRepo;
@Service

public class ClientServiceImpl implements IClientService {
	
	@Autowired
	private IClientRepo crep;
	

	@Override
	public void addClient(Client c) {
		crep.save(c);
		
	}

	@Override
	public List<Client> allClient() {
		
		return crep.findAll();
	}

	@Override
	public List<Client> getClientMc(String mc) {
		// TODO Auto-generated method stub
		return crep.ClientByMC(mc);
	}

}
