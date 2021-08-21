package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Empresa;


public interface EmpresaRepository extends JpaRepository <Empresa, Long> {
	
	Empresa findById(long id);
}
