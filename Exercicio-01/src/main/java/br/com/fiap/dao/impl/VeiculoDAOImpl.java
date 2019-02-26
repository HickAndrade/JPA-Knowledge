package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.Error404;

public class VeiculoDAOImpl implements VeiculoDAO {
	EntityManager em;

	public VeiculoDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public void cadastrar(Veiculo veiculo) {
		em.persist(veiculo);
	}

	public Veiculo consultar(int codigo) {
		return em.find(Veiculo.class, codigo);

	}

	public void atualizar(Veiculo veiculo) {
		em.merge(veiculo);

	}

	public void deletar(int codigo) throws Error404 {
		Veiculo veiculo = consultar(codigo);
		if (veiculo == null) {
			throw new Error404();
		}else {
			em.remove(veiculo);
		}
		

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
