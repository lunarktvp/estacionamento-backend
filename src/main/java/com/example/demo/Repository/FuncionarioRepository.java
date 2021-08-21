package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Funcionario;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	Funcionario findById(long id);
	
	@Query(value="select (count(matricula)+1) from funcionarios", nativeQuery=true)
	int pegamatricula();
}
