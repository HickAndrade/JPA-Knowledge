package br.com.hick.dao.impl;

import javax.persistence.EntityManager;

import br.com.hick.entity.Campeonato;

public class CampeonatoDAOImpl	extends GenericDAOImpl<Campeonato, Integer> {

	public CampeonatoDAOImpl(EntityManager em) {
		super(em);
	}

}
