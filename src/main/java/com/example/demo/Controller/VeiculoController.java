package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Veiculo;
import com.example.demo.Repository.VeiculoRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/veiculo")
public class VeiculoController {

	@Autowired
	private VeiculoRepository veiculoRep;

	
	@PostMapping("/novo")
	public Veiculo NovoVeiculo(@RequestBody Veiculo veiculo) {
		
		return veiculoRep.save(veiculo);
	}


	@GetMapping("/listar/{id}")
	public List<Veiculo> ListarPorCliente(@PathVariable(value="id") long id) {
		
		return veiculoRep.VeiculosPorcliente(id);
	}
	
	
	public List<Veiculo> ListarVeiculos(){
		
		return veiculoRep.findAll();
	}

}
