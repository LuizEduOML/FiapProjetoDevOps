package br.com.fiap.control;

import br.com.fiap.exceptions.CommitErrorException;
import br.com.fiap.exceptions.KeyNotFoundException;

public interface GenericDAO<T, K> {
	
	void create(T entity);
	
	T read(K key) throws KeyNotFoundException;
	
	void update(T entity);
	
	void delete(K key) throws KeyNotFoundException;
	
	void commit() throws CommitErrorException;

}
