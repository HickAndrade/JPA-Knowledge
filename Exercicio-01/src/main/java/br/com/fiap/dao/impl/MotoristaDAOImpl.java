package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.MotoristaDAO;
import br.com.fiap.entity.Motorista;
import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.Error404;

public class MotoristaDAOImpl implements MotoristaDAO {
	EntityManager em;

	public MotoristaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public void cadastrar(Motorista motorista) {
		em.persist(motorista);
	}

	public Motorista Consultar(int codigo) {
		return em.find(Motorista.class, codigo);
	}

	public void Atualizar(Motorista motorista) {
		em.merge(motorista);
	}

	public void deletar(int codigo) throws Error404 {
		Motorista motorista = Consultar(codigo);
		if (motorista == null) {
			throw new Error404();
		}else {
			em.remove(motorista);
		} // opa

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
