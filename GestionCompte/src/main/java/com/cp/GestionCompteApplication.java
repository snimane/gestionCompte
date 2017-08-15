package com.cp;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cp.entites.Client;
import com.cp.service.IClientService;

@SpringBootApplication
public class GestionCompteApplication {

	public static void main(String[] args) {
		org.springframework.context.ApplicationContext ctx=SpringApplication.run(GestionCompteApplication.class, args);
		IClientService ics=ctx.getBean(IClientService.class);
		ics.addClient(new Client("imane"));
		ics.addClient(new Client("koko"));
	}
}
