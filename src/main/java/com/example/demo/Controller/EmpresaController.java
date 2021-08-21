package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Empresa;
import com.example.demo.Repository.EmpresaRepository;



//Essa classe faz todas as movimetantações referentes a empresa

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/emp")
public class EmpresaController {
	
	@Autowired
	EmpresaRepository empresarep;
	
	//Metodo para listar as empresas cadastradas
	@GetMapping("/empresas")
	public List<Empresa> ListaEmpresas(){
		
		return empresarep.findAll();	
	}
	

	//Metodo para pesquisar uma empresa pela id
	@GetMapping("/empresa/{id}")
	public Empresa ConsultaEmpresa(@PathVariable(value="id") long id){
		
		return empresarep.findById(id);	
	}
	
	//Meotodo para cadastra uma nova empresa 
		@PostMapping("/empresa")
		public Empresa novaempresa(@RequestBody Empresa emp) {
		
			return empresarep.save(emp);
		}
	
	
	//Meotodo para deletar uma empresa
		@DeleteMapping("/empresa")
		public void DeleteEmpresa(@RequestBody Empresa emp) {
			
			empresarep.delete(emp);
		}
	
	//Metodo para atualizar uma emprsa
		@PutMapping("/empresa")
		public Empresa AtualizaEstacionamento(@RequestBody Empresa emp) {
			
			return empresarep.save(emp);
		}
}
