package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> Clientes() {
		TypedQuery<Cliente> query = em.createQuery("from Cliente",Cliente.class);
		
		return query.getResultList();
	}

	@Override
	public List<Cliente> RetornarPorNome(String nome) {
		TypedQuery<Cliente> query = em.createQuery("from Cliente c where c.nome like :name",Cliente.class);
		query.setParameter("name", "%"+nome+"%");
		
		return query.getResultList();
	} 
	
	
	

}
