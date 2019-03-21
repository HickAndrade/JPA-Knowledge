package br.com.hick.dao.impl;

import javax.persistence.EntityManager;

import br.com.hick.dao.TimeDAO;
import br.com.hick.entity.Time;

public class TimeDAOImpl extends GenericDAOImpl<Time, Integer> implements TimeDAO {

	public TimeDAOImpl(EntityManager em) {
		super(em);
	}


	

}
