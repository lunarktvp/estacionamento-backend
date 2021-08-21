package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

	Ticket findById(long id);

}
