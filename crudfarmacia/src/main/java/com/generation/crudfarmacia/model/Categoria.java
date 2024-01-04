package com.generation.crudfarmacia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank (message = "O Atributo nome é obrigatório!")
	@Size (min = 3, message = "O Atributo nome deve conter no mínimo 3 caracteres.")
	private String nome;
	
	@Size (min = 3, message = "O Atributo classificação deve conter no mínimo 3 caracteres.")
	private String classificacao;
	
	@Size (min = 3, message = "O Atributo cor da tarja deve conter no mínimo 3 caracteres.")
	private String corTarja;
	
	@Size (min = 5, message = "O nomero do lote deve conter no mínimo 5 caracteres.")
	private String numeroLote;
	
	@Column(length = 500)
	@Size(min = 3, max = 500, message = "O atributo descrição da classificao deve conter entre 3 e 500 caracteres")
	private String descricaoClassificacao;

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

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getCorTarja() {
		return corTarja;
	}

	public void setCorTarja(String corTarja) {
		this.corTarja = corTarja;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

	public String getDescricaoClassificacao() {
		return descricaoClassificacao;
	}

	public void setDescricaoClassificacao(String descricaoClassificacao) {
		this.descricaoClassificacao = descricaoClassificacao;
	}

}
