package br.com.fiap.control;

import br.com.fiap.entity.Lote;
import br.com.fiap.exceptions.CommitErrorException;
import br.com.fiap.exceptions.LoteNotFoundException;

public interface LoteDAO {
	
	void create(Lote lote);
	
	Lote read(int codigo);
	
	void update(Lote lote);
	
	void delete(int codigo) throws LoteNotFoundException;
	
	void commit() throws CommitErrorException;

}
