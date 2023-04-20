package com.generation.lojagames.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.lojagames.model.Produtos;
import com.generation.lojagames.repository.ProdutosRepository;

import jakarta.validation.Valid;

//@RestController -> tornar essa classe uma controladora de rotas
//@RequestMapping -> falar qual a rota para essas consultas

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutosController {

	@Autowired // inseção de dependencia --> está chamando a repository para consultar a tabela
	private ProdutosRepository produtosRepository;

	@GetMapping
	// ResponseEntity --> é uma classe para dar apoio no StatusCode
	public ResponseEntity<List<Produtos>> getAll() {

		// ResponseEntity.ok ele vai fazer a resposta do insonia
		// postagemRepository.findAll() traz tudo de dentro do banco de dados
		return ResponseEntity.ok(produtosRepository.findAll());
	}
	
	// SELECT * FROM tb_postagem WHERE id = id;
	@GetMapping("/{id}")
	public ResponseEntity<Produtos> getById(@PathVariable Long id){
		return produtosRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	// SELECT * FROM tb_postagens WHERE titulo LIKE "%nome%";
		@GetMapping("/nome/{nome}")
		public ResponseEntity<List<Produtos>> getByTitulo(@PathVariable String nome){
			return ResponseEntity.ok(produtosRepository
						.findAllByNomeContainingIgnoreCase(nome));
		}
	
	// INSERT INTO tb_postagens (nome, valor, codigo, quantidade, dt_validade) VALUES ("nome", "valor", "codigo", "quantidade", "dt_validade");
	@PostMapping
	public ResponseEntity<Produtos> post(@Valid @RequestBody Produtos produtos){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(produtosRepository.save(produtos));
	}
	
	// UPDATE tb_postagens SET nome = "nome", valor = "valor", codigo = "codigo",  quantidade = "quantidade",  dt_validade = "dt_validade" WHERE id = id;
	@PutMapping
	public ResponseEntity<Produtos> put(@Valid @RequestBody Produtos produtos){
		return produtosRepository.findById(produtos.getId())
				.map(resposta -> ResponseEntity.status(HttpStatus.OK)
						.body(produtosRepository.save(produtos)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	// DELETE FROM tb_produto WHERE id = id;
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping ("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Produtos> produto = produtosRepository.findById(id);
		
		// Verifica se existe o ID dentro da tabela
		if(produto.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		produtosRepository.deleteById(id);
	}
}
