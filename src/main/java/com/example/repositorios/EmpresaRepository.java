package com.example.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelos.Empresa;

public interface EmpresaRepository extends JpaRepository <Empresa, Long> {
	
	Empresa findById(long id);

}
