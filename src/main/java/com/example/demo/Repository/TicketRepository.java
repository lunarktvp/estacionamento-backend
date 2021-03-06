package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

	Ticket findById(long id);
	
	@Query(nativeQuery=true, value="select * from tickets order by situacao")
	List<Ticket> findabertos();
	
	@Query(nativeQuery=true, value="select * from tickets where situacao like '9' order by situacao")
	List<Ticket> FindFechadosNoDia();
	
	@Query(nativeQuery=true, value="select * from tickets where situacao <> 9 and placa ilike ?1")
	Ticket TicketAtivoPorPlaca(String placa);

}
