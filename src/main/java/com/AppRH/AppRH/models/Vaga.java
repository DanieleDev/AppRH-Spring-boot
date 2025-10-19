package com.AppRH.AppRH.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Vaga implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long codigo;
	
	@NotBlank
	private String nome;
	
	@NotEmpty
	private String descricao;
	
	@NotEmpty
    @Future
	private LocalDate data;
	
	@NotEmpty
	private String salario;
	
	@OneToMany (mappedBy = "vaga", cascade = CascadeType.REMOVE)
	private List<Candidato> canditatos;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public @NotEmpty @Future LocalDate getData() {
		return data;
	}

	public void setData(@NotEmpty @Future LocalDate data) {
		this.data = data;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public List<Candidato> getCanditatos() {
		return canditatos;
	}

	public void setCanditatos(List<Candidato> canditatos) {
		this.canditatos = canditatos;
	}
	
	
}
