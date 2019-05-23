package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;

public class EntityManagerFactorySingleton {

	private static EntityManagerFactory emf;
	
	private EntityManagerFactorySingleton() {}
	
	public static EntityManagerFactory getInstance() {
		return emf;
	}
	
}




