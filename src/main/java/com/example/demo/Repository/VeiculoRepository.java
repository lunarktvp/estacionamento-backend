package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Veiculo;



public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
	
	@Query(value="select * from veiculo where id_cliente = '%id%'", nativeQuery=true)
	List<Veiculo> VeiculosPorcliente(long id);
	

}
