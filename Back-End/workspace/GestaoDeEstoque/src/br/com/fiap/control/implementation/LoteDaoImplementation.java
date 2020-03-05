package br.com.fiap.control.implementation;

import javax.persistence.EntityManager;

import br.com.fiap.control.LoteDAO;
import br.com.fiap.entity.Lote;
import br.com.fiap.exceptions.CommitErrorException;
import br.com.fiap.exceptions.LoteNotFoundException;

public class LoteDaoImplementation implements LoteDAO{

	private EntityManager em;
	
	@Override
	public void create(Lote lote) {
		em.persist(lote);
	}

	@Override
	public Lote read(int codigo) {
		return em.find(Lote.class, codigo);
	}

	@Override
	public void update(Lote lote) {
		em.merge(lote);
	}

	@Override
	public void delete(int codigo) throws LoteNotFoundException {
		Lote lote = read(codigo);
		
		if (lote == null) {
			throw new LoteNotFoundException();
		}
		
		em.remove(lote);
	}

	@Override
	public void commit() throws CommitErrorException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw new CommitErrorException();
		}
	}}
