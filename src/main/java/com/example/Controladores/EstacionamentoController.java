package com.example.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelos.Estacionamento;
import com.example.repositorios.EmpresaRepository;
import com.example.repositorios.EstacionamentoRepository;

@RestController
@RequestMapping(value="/est")
public class EstacionamentoController {
	
	@Autowired
	EstacionamentoRepository estacionamentoRep;
	
	@Autowired
	EmpresaRepository empresaRep;
	

	//Metodo para listar os Estacionamentos cadastrados
		@GetMapping("/estacionamentos")
		public List<Estacionamento> ListaEstacionamentos(){
			
			return estacionamentoRep.findAll();	
		}
		

		//Metodo para pesquisar um estacionamento pelo Id
		@GetMapping("/estacionamento/{id}")
		public Estacionamento ConsultaEstacionamento(@PathVariable(value="id") long id){
			
			return estacionamentoRep.findById(id);
		}
		
		//Meotodo para cadastra um estacionamento
		@PostMapping("/estacionamento")
		public Estacionamento NovoEstacionamento(@RequestBody Estacionamento est) {
	
			return estacionamentoRep.save(est);
			
			
			}
		
		
		//Meotodo para deletar um estacionamento
		@DeleteMapping("/estacionamento")
		public void DeleteEstacionamento(@RequestBody Estacionamento est) {
			estacionamentoRep.delete(est);
		}
	
	
		@PutMapping("/estacionamento")
		public Estacionamento AtualizaEstacionamento(@RequestBody Estacionamento est) {
			
			return estacionamentoRep.save(est);
		}
		
	
}
