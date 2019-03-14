package br.com.fiap.testeJUnit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.CustomerDAO;
import br.com.fiap.dao.impl.CustomerDAOImpl;
import br.com.fiap.entity.Customer;
import br.com.fiap.entity.Gender;
import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.NotFoundException;

class CustomerDAOtest {

	private static CustomerDAO dao;

	private Customer customer;
	
	@BeforeAll // metodo execultado antes de todos os testes
	public static void init() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("teste");
		EntityManager em = fabrica.createEntityManager();
		dao = new CustomerDAOImpl(em);
	}

	@BeforeEach
	void BeforeTest() {
		 customer = new Customer("Teste", new GregorianCalendar(1999, Calendar.MARCH, 15), Gender.MALE, null);
		// Act: Cadastrar o criante
		try {
			dao.commit();
			dao.create(customer);
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no Teste");
		}

	}
	
	@Test	
	@DisplayName("Cadastrado com sucesso")

	void createTest() {

		// Assert: validar o resultado
		// valida se a sequence gerou um codigo para o customer
		assertNotEquals(customer.getId(), 0);
	}

	@Test
	@DisplayName("Busca com sucesso")
	void ReadTest() {

		try {
			Customer search = dao.read(customer.getId());
			
			assertNotNull(search);
			assertEquals(search.getId(), search.getId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Falha no teste");
		}
	}
	
	@Test
	@DisplayName("Teste de atualização com sucesso")
	void UpdateTest() {

	customer.setName("salve");
	customer.setGender(Gender.FEMALE);
	
	//atualizar
	try {
		dao.update(customer);
		dao.commit();
		
	} catch (CommitException | NotFoundException e) {
		e.printStackTrace();
		fail("Falha ao Atualizar");
	} 
	
	//pesquisar
	try {
		Customer search =dao.read(customer.getId());
		assertEquals("salve", search.getName());
	} catch (NotFoundException e) {
		e.printStackTrace();
		fail("Falha ao Atualizar");
	}
	
	}

	void DeleteTest() {
	
		try {
			dao.delete(customer.getId());
			dao.commit();
			
		} catch (NotFoundException | CommitException e) {
			e.printStackTrace();
			fail("deu ruim");
		}
		
		Customer search = null;
		try {
			 search = dao.read(customer.getId());
		} catch (NotFoundException e) {
		
			assertNull(search);
		}
		
		
		
	}





}
