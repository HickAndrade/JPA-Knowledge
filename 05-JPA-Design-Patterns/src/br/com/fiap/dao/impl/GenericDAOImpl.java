package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import br.com.fiap.dao.GenericDAO;
import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.NotFoundException;

public abstract class GenericDAOImpl<Table, Key> implements GenericDAO<Table, Key> {
	EntityManager em;

	private Class<Table> clazz;

	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em) {
		super();
		this.em = em;
		this.clazz = (Class<Table>) ((ParameterizedType) 
				getClass().getGenericSuperclass()).getActualTypeArguments()[0];

	}

	public void create(Table T) {
		em.persist(T);
	}

	public Table read(Key K) throws NotFoundException {
		Table entity = em.find(clazz, K);
		if (entity == null) {
			throw new NotFoundException();
		}
		return entity;
	}

	public void update(Table t) throws NotFoundException {
		em.merge(t);
	}

	public void delete(Key Key) throws NotFoundException {
		Table entity = read(Key);
		// if (entity == null) {
		// throw new NotFoundException();
		//

		em.remove(entity);
	}

	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}

}
