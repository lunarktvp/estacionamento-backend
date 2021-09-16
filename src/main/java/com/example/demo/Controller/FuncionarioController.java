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

import com.example.demo.Model.Funcionario;
import com.example.demo.Repository.FuncionarioRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/func")
public class FuncionarioController {
	
	@Autowired
	FuncionarioRepository funcRep;
	

	//Metodo para listar os funcionarios cadastrados
		@GetMapping("/funcionarios")
		public List<Funcionario> ListaFuncionario(){
			
			return funcRep.findAll();	
		}
		

		//Metodo para pesquisar um funcionario pelo Id
		@GetMapping("/funcionario/{id}")
		public Funcionario ConsultaFuncionario(@PathVariable(value="id") long id){
			
			return funcRep.findById(id);
		}
		
		//Meotodo para cadastrar um estacionamento
		@PostMapping("/funcionario")
		public Funcionario NovoFuncionario(@RequestBody Funcionario est) {
	
			return funcRep.save(est);
			
			
			}
		
		
		//Meotodo para deletar um funcionairo
		@DeleteMapping("/funcionario")
		public void DeleteFuncionario(@RequestBody Funcionario est) {
			funcRep.delete(est);
		}
	
	
		@PutMapping("/funcionario")
		public Funcionario AtualizaEstacionamento(@RequestBody Funcionario est) {
			
			return funcRep.save(est);
		}
		
		@GetMapping("/mat")
		public int pegaMatricula() {
			
			return funcRep.pegamatricula();
		}
}
