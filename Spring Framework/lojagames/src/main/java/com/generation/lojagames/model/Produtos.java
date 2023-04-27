// Model --> modelagem do banco de dados(criação das tabelas)

package com.generation.lojagames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O Atributo Nome é Obrigatório")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres") // para informar o valor minino e maximo
	private String nome;
	
	private int quantidade;
	
	@NotBlank(message = "O Atributo Marca é Obrigatório")
	@Size(min = 5, max = 100, message = "O atributo marca deve conter no mínimo 05 e no máximo 100 caracteres") // para informar o valor minino e maximo
	private String marca;
	
	@NotBlank(message = "O Atributo Modelo é Obrigatório")
	@Size(min = 5, max = 100, message = "O atributo modelo deve conter no mínimo 05 e no máximo 100 caracteres") // para informar o valor minino e maximo
	private String modelo;
	
	private BigDecimal preco;
	
	private int codigo;
	
		// Relacionamento entre tabelas - N:1
		@ManyToOne
		@JsonIgnoreProperties("produtos")
		private Categoria categoria;
	
		// Relacionamento entre tabelas - N:1
		@ManyToOne
		@JsonIgnoreProperties("produtos")
		private Usuario usuario;

		// Getteres and Setteres 
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
	
}
