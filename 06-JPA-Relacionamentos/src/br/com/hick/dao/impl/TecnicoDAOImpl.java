package br.com.hick.dao.impl;

import javax.persistence.EntityManager;

import br.com.hick.dao.TecnicoDAO;
import br.com.hick.entity.Tecnico;

public class TecnicoDAOImpl	extends GenericDAOImpl<Tecnico, Integer> implements TecnicoDAO {

	public TecnicoDAOImpl(EntityManager em) {
		super(em);
	}





}
