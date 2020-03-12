package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_SGE_PRODUTO")
@SequenceGenerator(name = "idGenerator", sequenceName = "SQ_T_SGE_PRODUTO", allocationSize = 1)
public class Produto {
	
	@Id
	@Column(name = "cd_produto")
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "idGenerator")
	private int codigo;
	
	@Column(name = "ds_produto", nullable = false, length = 250)
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_categoria", nullable = false, length = 50)
	private Categoria categoria;
	
	// CONSTRUCTORS
	public Produto() {
		super();
	}
	
	public Produto(int codigo, String descricao, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.categoria = categoria;
	}
	
	// GETTERS AND SETTERS
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}