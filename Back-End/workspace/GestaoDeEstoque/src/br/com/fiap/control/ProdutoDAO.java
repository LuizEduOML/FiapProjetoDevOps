package br.com.fiap.control;

import br.com.fiap.entity.Produto;
import br.com.fiap.exceptions.CommitErrorException;
import br.com.fiap.exceptions.ProdutoNotFoundException;

public interface ProdutoDAO {
	
	void create(Produto produto);
	
	Produto read(int codigo);
	
	void update(Produto produto);
	
	void delete(int codigo) throws ProdutoNotFoundException;
	
	void commit() throws CommitErrorException;

}
 