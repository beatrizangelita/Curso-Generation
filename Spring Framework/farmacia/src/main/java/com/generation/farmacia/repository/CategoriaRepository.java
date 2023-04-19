// Repository --> consultas no banco de dados 

package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	// Para conseguir acessar a tabela Postagem
	// SELECT * FROM tb_temass WHERE descricao LIKE "%descricao%";
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
