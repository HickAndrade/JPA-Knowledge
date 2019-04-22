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
		TypedQuery<Cliente> query = em.createQuery("from Cliente c where lower(c.nome) like :name",Cliente.class);
		query.setParameter("name", "%"+nome.toLowerCase()+"%");
		
		return query.getResultList();
	} 
	@Override
	public List<Cliente> Buscar(String nome, String cidade) {
		return em.createQuery("from Cliente c where c.nome like :D and c.endereco.cidade.nome like :C ",Cliente.class)
				.setParameter("D","%"+ nome+"%")
				.setParameter("C", "%"+cidade+"%")
				.getResultList();
	}

	@Override
	public List<Cliente> BuscarPorEstados(List<String> estados) {
		return em.createQuery("from Cliente c where c.endereco.cidade.uf in :C",Cliente.class)
				.setParameter("C", estados)
				.getResultList();
	}

	@Override
	public Long countByEstado(String estado) {
		return em.createQuery("select count(c) from Cliente c where c.endereco.cidade.uf = :D ",Long.class)
				.setParameter("D", estado)
				.getSingleResult();
	}
	
	
	
	

}
