package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Veiculo;



public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
	
	@Query(value="select * from veiculo where id_cliente = ?1", nativeQuery=true)
	List<Veiculo> VeiculosPorcliente(long id);
	
	@Query(value="select * from veiculo where placa ilike '%?1%'", nativeQuery=true)
	Veiculo VeiculoPorPlaca(String placa);
}
