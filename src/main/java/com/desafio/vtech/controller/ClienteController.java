package com.desafio.vtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.vtech.model.Cliente;
import com.desafio.vtech.repository.ClienteRepository;
import com.desafio.vtech.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ClienteService clienteService;

	@PostMapping("/cadastrar")
	public ResponseEntity<Cliente> Post(@RequestBody Cliente cliente) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(clienteService.CadastrarCliente(cliente));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Cliente>> GetAll(){
		return ResponseEntity.ok(clienteRepository.findAll());
	}
	
	@PutMapping
	public ResponseEntity<Cliente> Put(@RequestBody Cliente cliente)
	{
		return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.save(cliente));
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable long id)
	{
		clienteRepository.deleteById(id);
	}
}
