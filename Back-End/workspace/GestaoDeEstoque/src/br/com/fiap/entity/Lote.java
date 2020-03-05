package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_SGE_LOTE")
@SequenceGenerator(name = "idGenerator", sequenceName = "SQ_T_SGE_LOTE", allocationSize = 1)
public class Lote {
	
	@Id
	@Column(name = "cd_lote")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idGenerator")
	private int codigo;
	
	@Column(name = "nr_lote", nullable = false)
	private int numero;
	
	// CONSTRUCTORS
	public Lote() {
		super();
	}

	public Lote(int codigo, int numero) {
		super();
		this.codigo = codigo;
		this.numero = numero;
	}
	
	// GETTERS AND SETTERS
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
