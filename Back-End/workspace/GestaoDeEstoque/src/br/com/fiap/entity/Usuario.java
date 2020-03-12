package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_SGE_USUARIO")
@SequenceGenerator(name = "idGenerator", sequenceName = "SQ_T_SGE_USUARIO", allocationSize = 1)
public class Usuario {

	@Id
	@Column(name = "cd_usuario")
	@GeneratedValue(generator = "idGenerator", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "nm_usuario", nullable = false, length = 100)
	private String nome;

	@Column(name = "nm_departamento", nullable = false, length = 30)
	private String nomeDepartamento;

	public Usuario() {		super();	}

	public Usuario(int codigo, String nome, String nomeDepartamento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.nomeDepartamento = nomeDepartamento;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
}