package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_SGE_FORNECEDOR")
@SequenceGenerator(name = "idGenerator", sequenceName = "SQ_T_SGE_FORNECEDOR", allocationSize = 1)
public class Fornecedor {

	@Id
	@Column(name = "cd_fornecedor")
	@GeneratedValue(generator = "idGenerator", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "nm_fornecedor", nullable = false, length = 50)
	private String nome;

	public Fornecedor() {		super();	}

	public Fornecedor(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
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
}