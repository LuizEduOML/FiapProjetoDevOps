package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_SGE_ESTOQUE")
@SequenceGenerator(name = "idGenerator", sequenceName = "SQ_T_SGE_ESTOQUE", allocationSize = 1)
public class Estoque {

	@Id
	@Column(name = "cd_lote")
	@GeneratedValue(generator = "idGenerator", strategy = GenerationType.SEQUENCE)
	private int codigo;

	// @ForeignKey
	@Column(name = "cd_usuario", nullable = false)
	private int codigoUsuario;

	// @ForeignKey
	@Column(name = "cd_produto", nullable = false)
	private int codigoProduto;

	// @ForeignKey
	@Column(name = "cd_fornecedor", nullable = false)
	private int codigoFornecedor;

	@Column(name = "qt_produto", nullable = false)
	private int quantidade;

	@Column(name = "tp_lancamento", length = 1)
	private char tipo;

	@Column(name = "dt_lancamento")
	@Temporal(TemporalType.DATE)
	private Calendar dataLancamento;

	@Column(name = "nr_lancamento")
	private int numeroLancamento;

	public Estoque() {		super();	}

	public Estoque(int codigo, int codigoUsuario, int codigoProduto, int codigoFornecedor, int quantidade, char tipo,
			Calendar dataLancamento, int numeroLancamento) {
		super();
		this.codigo = codigo;
		this.codigoUsuario = codigoUsuario;
		this.codigoProduto = codigoProduto;
		this.codigoFornecedor = codigoFornecedor;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.dataLancamento = dataLancamento;
		this.numeroLancamento = numeroLancamento;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public int getCodigoFornecedor() {
		return codigoFornecedor;
	}
	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public int getNumeroLancamento() {
		return numeroLancamento;
	}
	public void setNumeroLancamento(int numeroLancamento) {
		this.numeroLancamento = numeroLancamento;
	}
}