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

import com.example.demo.Model.Ticket;
import com.example.demo.Repository.TicketRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/ticket")
public class TicketController {

	@Autowired
	private TicketRepository ticketRep;
	
	
	@PostMapping
	@RequestMapping("/novo")
	public Ticket NovoTiket(@RequestBody Ticket ticket) {
		
		return ticketRep.save(ticket);
	}
	
	@PutMapping
	@RequestMapping("/alterar")
	public Ticket alterarTicket(@RequestBody Ticket ticket) {	
		return ticketRep.save(ticket);
	}
	
	@GetMapping
	@RequestMapping("/detalhes/{id}")
	public Ticket detalhesTicket(@PathVariable(value="id") long id) {
		return ticketRep.findById(id);
	}
	
	
	@GetMapping
	@RequestMapping("/listar")
	public List<Ticket> ListarLickets(){
		
		return ticketRep.findabertos();
	}
	
	@GetMapping
	@RequestMapping("/encerradosdia")
	public List<Ticket> ListarFehcadosNoDia(){
		
		return ticketRep.FindFechadosNoDia();
	}
	
	@GetMapping
	@RequestMapping("/ticketativo/{placa}")
	public Ticket AtivoporPlaca(@PathVariable(value="placa") String placa) {
		
		return ticketRep.TicketAtivoPorPlaca(placa);
	}
	
}
