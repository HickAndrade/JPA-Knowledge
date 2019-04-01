package br.com.hick.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Usuario;
import br.com.hick.dao.UsuarioDAO;

public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Integer> implements UsuarioDAO {

	public UsuarioDAOImpl(EntityManager em) {
		super(em);
	}

}
