package br.com.fiap.teste;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Tipo;
import br.com.fiap.entity.Zoologico;

public class UpdateTeste {
public static void main(String[] args) {
	//Criar um objeto zoologico com um id existente no banco 
	// atualizar os dados no banco de dados 
	
	//// pega o java e atualiza o banco

	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	EntityManager em = fabrica.createEntityManager();
	
	Zoologico zoo = new Zoologico(1, "zoo de santos", 50,
			Tipo.Aquatico, new Date(), new Date(),
			Calendar.getInstance(), false, null);
	
	
	//Altera o nome do zoologico
	zoo.setNome("Zoo bauru");
	
	em.merge(zoo);
	//commit
	em.getTransaction().begin();
	em.getTransaction().commit();
	
	// FECHANDO  O OBJETO PRA NAO FICAR NA MEMORIA
	em.close();
	fabrica.close();
}
}
