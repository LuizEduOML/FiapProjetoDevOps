package br.com.fiap.control.implementation;

import javax.persistence.EntityManager;

import br.com.fiap.control.ProdutoDAO;
import br.com.fiap.entity.Produto;
import br.com.fiap.exceptions.CommitErrorException;
import br.com.fiap.exceptions.ProdutoNotFoundException;

public class ProdutoDaoImplementation implements ProdutoDAO {
	
	private EntityManager em;

	@Override
	public void create(Produto produto) {
		em.persist(produto);
	}

	@Override
	public Produto read(int codigo) {
		return em.find(Produto.class, codigo);
	}

	@Override
	public void update(Produto produto) {
		em.merge(produto);
	}

	@Override
	public void delete(int codigo) throws ProdutoNotFoundException {
		Produto produto = read(codigo);
		
		if (produto == null) {
			throw new ProdutoNotFoundException();
		}
		
		em.remove(produto);
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
