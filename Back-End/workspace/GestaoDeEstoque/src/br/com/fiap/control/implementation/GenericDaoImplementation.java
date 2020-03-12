package br.com.fiap.control.implementation;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.control.GenericDAO;
import br.com.fiap.exceptions.CommitErrorException;
import br.com.fiap.exceptions.KeyNotFoundException;

public class GenericDaoImplementation<T, K> implements GenericDAO<T, K> {
	
	private EntityManager em;
	
	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public GenericDaoImplementation(EntityManager em) {
		this.em = em;
		
		clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void create(T entity) {
		em.persist(entity);
	}

	@Override
	public T read(K key) throws KeyNotFoundException {
		T entity = em.find(clazz, key);
		
		if(entity == null) {
			throw new KeyNotFoundException();
		}
		
		return entity;
	}

	@Override
	public void update(T entity) {
		em.merge(entity);
	}

	@Override
	public void delete(K key) throws KeyNotFoundException {
		T entity = read(key);
		
		em.remove(entity);
	}
	
	@Override
	public void commit() throws CommitErrorException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw new CommitErrorException();
		}
	}
	
}
