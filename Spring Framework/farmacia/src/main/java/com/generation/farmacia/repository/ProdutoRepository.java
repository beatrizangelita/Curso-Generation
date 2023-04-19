// Repository --> consultas no banco de dados 

package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Produto;

@Repository

//Para conseguir acessar a tabela Postagem
//SELECT * FROM tb_temass WHERE descricao LIKE "%descricao%";
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
