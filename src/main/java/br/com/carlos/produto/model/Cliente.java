package br.com.carlos.produto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

@Entity
public class Cliente {
	
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 
	 @NotNull
	 private String nome;
	 
	 @NotNull
	 private String cpf;
	 
	 @NotNull
	 private String sexo;
	 
	 @NotNull
	 @NumberFormat(pattern="##/##/##")
	 private String dataNascimento;
	 
	 public Cliente() {

	 }

	 public Cliente(String nome, String cpf, String dataNascimento, String sexo) {
		 this.nome = nome;
		 this.cpf = cpf;
		 this.sexo = sexo;
		 this.dataNascimento = dataNascimento;
	 }

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}