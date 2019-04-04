package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ReservaDAO;
import br.com.fiap.entity.Reserva;

public class ReservaDAOImpl extends GenericDAOImpl<Reserva,Integer> implements ReservaDAO {

	public ReservaDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Reserva> Listar() {
		TypedQuery<Reserva> query = em.createQuery("from Reserva", Reserva.class);
		
		return query.getResultList();
	}

	@Override
	public List<Reserva> BuscarPorNumeroDias(int dias) {
		TypedQuery<Reserva> query = em.createQuery("from Reserva r where r.numeroDias = :days",Reserva.class);
		query.setParameter("days", dias);
		return query.getResultList();
	}

	
}
