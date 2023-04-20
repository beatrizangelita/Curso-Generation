package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.lojagames.model.Produtos;

@Repository

//Para conseguir acessar a tabela Postagem
//SELECT * FROM tb_temass WHERE descricao LIKE "%descricao%";
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
	
	public List<Produtos> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
