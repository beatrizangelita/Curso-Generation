// Controller é para controlar a rota das suas aplicações (Consulta)

package com.generation.farmacia.controller;

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

import com.generation.farmacia.model.Produto;
import com.generation.farmacia.repository.ProdutoRepository;

import jakarta.validation.Valid;

//@RestController -> tornar essa classe uma controladora de rotas
//@RequestMapping -> falar qual a rota para essas consultas

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {

	@Autowired // inseção de dependencia --> está chamando a repository para consultar a tabela
	private ProdutoRepository produtoRepository;

	@GetMapping
	// ResponseEntity --> é uma classe para dar apoio no StatusCode
	public ResponseEntity<List<Produto>> getAll() {

		// ResponseEntity.ok ele vai fazer a resposta do insonia
		// postagemRepository.findAll() traz tudo de dentro do banco de dados
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	
	// SELECT * FROM tb_postagem WHERE id = id;
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable Long id){
		return produtoRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	// SELECT * FROM tb_postagens WHERE titulo LIKE "%nome%";
		@GetMapping("/nome/{nome}")
		public ResponseEntity<List<Produto>> getByTitulo(@PathVariable String nome){
			return ResponseEntity.ok(produtoRepository
						.findAllByNomeContainingIgnoreCase(nome));
		}
	
	// INSERT INTO tb_postagens (nome, valor, codigo, quantidade, dt_validade) VALUES ("nome", "valor", "codigo", "quantidade", "dt_validade");
	@PostMapping
	public ResponseEntity<Produto> post(@Valid @RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(produtoRepository.save(produto));
	}
	
	// UPDATE tb_postagens SET nome = "nome", valor = "valor", codigo = "codigo",  quantidade = "quantidade",  dt_validade = "dt_validade" WHERE id = id;
	@PutMapping
	public ResponseEntity<Produto> put(@Valid @RequestBody Produto produto){
		return produtoRepository.findById(produto.getId())
				.map(resposta -> ResponseEntity.status(HttpStatus.OK)
						.body(produtoRepository.save(produto)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	// DELETE FROM tb_produto WHERE id = id;
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping ("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Produto> produto = produtoRepository.findById(id);
		
		// Verifica se existe o ID dentro da tabela
		if(produto.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		produtoRepository.deleteById(id);
	}
}
