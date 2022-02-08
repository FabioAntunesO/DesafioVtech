package com.desafio.vtech.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.desafio.vtech.model.Cliente;
import com.desafio.vtech.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	public Cliente CadastrarCliente(Cliente cliente) {
		return repository.save(cliente);
	}
}