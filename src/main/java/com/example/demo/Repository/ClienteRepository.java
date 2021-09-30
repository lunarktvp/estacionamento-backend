package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Cliente;



public interface ClienteRepository extends JpaRepository <Cliente, Long>{

	Cliente findById(long id);
	
	@Query(value="select * from clientes where id in (select id_cliente from veiculos where placa ilike %?1%)",nativeQuery=true)
	Cliente buscaporPlaca(String placa);
}
