// Model --> modelagem do banco de dados(criação das tabelas)


package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	@Id // informando que é a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // para que seja gerado automaticamente
	private Long id;
	
	@NotBlank(message = "O atributo título é Obrigatório!") // NotNull
	@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres") // para informar o valor minino e maximo
	private String titulo;
	
	@NotBlank(message = "O atributo texto é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo texto deve conter no mínimo 05 e no máximo 100 caracteres")
	private String texto;
	
	@UpdateTimestamp // dar um update automaticamente na data
	private LocalDateTime data; 

	
	// Getteres and Setteres 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTítulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
}
