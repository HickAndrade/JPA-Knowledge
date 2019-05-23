package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.LocacaoDAO;
import br.com.fiap.entity.Locacao;

public class LocacaoDAOImpl  extends GenericDAOImpl<Locacao , Integer> implements LocacaoDAO{

	public LocacaoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
