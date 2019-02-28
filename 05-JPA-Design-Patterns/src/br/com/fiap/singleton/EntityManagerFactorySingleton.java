package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

		// 1 - Atributo estatico do objeto que será unico	
		
	private static EntityManagerFactory emf;
	
		// 2 - Contrutor privado
	
	private EntityManagerFactorySingleton() {}
	
	// 3 - metodo estatico que instancia o objeto unico
	
	public static EntityManagerFactory getInstance() {
		
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}	
		return emf;		
	}
	
	
}
