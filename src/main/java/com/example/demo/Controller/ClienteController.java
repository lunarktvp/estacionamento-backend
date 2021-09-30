package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Cliente;
import com.example.demo.Repository.ClienteRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/cliente")
public class ClienteController {
	
	
	@Autowired
	private ClienteRepository clienteRep;

	//Cadastrar Novo Cliente
	@PostMapping("/novo")
	public Cliente 	NovoCliente(@RequestBody Cliente cliente) {
		
		return clienteRep.save(cliente);
	}
	
	
	@GetMapping("/listar")
	public List<Cliente> ListarClientes(){
		
		return clienteRep.findAll();
	}
	
	@GetMapping("/detalhes/{id}")
	public Cliente DetalhesPorId(@PathVariable long id) {
		
		return clienteRep.findById(id);
	}
	
	@GetMapping("/buscapor/{placa}")
	public Cliente DetalhesPorPlaca(@PathVariable(value="placa") String placa) {
		
		return clienteRep.buscaporPlaca(placa);
	}


	@PutMapping("/alterar")
	public Cliente AlterarCliente(@RequestBody Cliente cliente) {
		
		return clienteRep.save(cliente);
	}







}

