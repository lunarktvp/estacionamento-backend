package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

	Ticket findById(long id);
	
	@Query(nativeQuery=true, value="select * from tickets order by hora_entrada desc, situacao")
	List<Ticket> findabertos();

}
