package com.example.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelos.Estacionamento;

public interface EstacionamentoRepository extends JpaRepository<Estacionamento, Long> {
	
	Estacionamento findById(long id);
	
}
