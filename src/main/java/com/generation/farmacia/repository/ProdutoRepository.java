package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
	
	List<Produto> findAllByNomeOrLaboratorioContainingIgnoreCase(@Param("nome")String nome, @Param("laboratorio")String laboratorio);
	
	List<Produto> findAllByNomeAndLaboratorioContainingIgnoreCase(@Param("nome")String nome, @Param("laboratorio")String laboratorio);
	
	List<Produto> findAllByPrecoBetween(BigDecimal pecroInicio, BigDecimal precoFim);

}
