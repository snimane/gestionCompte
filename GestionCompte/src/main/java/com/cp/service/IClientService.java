package com.cp.service;

import java.util.List;

import com.cp.entites.Client;

public interface IClientService {
	
	public void addClient(Client c);
	public List allClient();
	public List<Client> getClientMc(String mc);

}
