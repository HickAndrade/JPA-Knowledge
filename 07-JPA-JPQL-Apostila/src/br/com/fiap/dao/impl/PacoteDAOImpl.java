package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote,Integer> implements PacoteDAO{

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> BuscarPorDatas(Calendar inicio, Calendar fim) {	
		return em.createQuery("from Pacote p where p.dataSaida BETWEEN :ini and :fim",Pacote.class)
				.setParameter("ini", inicio)
				.setParameter("fim", fim).getResultList();
	}

	
	

}
