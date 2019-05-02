package br.com.fiap.teste;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.AnimalDAO;
import br.com.fiap.dao.impl.AnimalDAOImpl;
import br.com.fiap.entity.Animal;
import br.com.fiap.entity.Mamifero;
import br.com.fiap.entity.Reptil;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class Teste {

	private static AnimalDAO dao;

	@BeforeAll
	public static void init() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new AnimalDAOImpl(em);
	}

	 

}
