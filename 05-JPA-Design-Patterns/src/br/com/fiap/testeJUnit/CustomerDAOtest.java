package br.com.fiap.testeJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import br.com.fiap.dao.CustomerDAO;
import br.com.fiap.dao.impl.CustomerDAOImpl;
import br.com.fiap.entity.Customer;
import br.com.fiap.entity.Gender;
import br.com.fiap.excecao.CommitException;

class CustomerDAOtest {
	
	@Test
	void createTest() {
		//Arranje: instanciar objetos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("teste");
		EntityManager em = fabrica.createEntityManager();
		CustomerDAO dao = new CustomerDAOImpl(em);
		Customer c = new Customer("Teste", new GregorianCalendar(1999,Calendar.MARCH,15), Gender.MALE, null);
		
		//Act: Cadastrar o criante
		try {
			dao.commit();
			dao.create(c);
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no Teste");
		}
		
		//Assert: validar o resultado
		//valida se a sequence gerou um codigo para o customer
		assertNotEquals(c.getId(), 0);
	}

}
