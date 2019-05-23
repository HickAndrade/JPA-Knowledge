package br.com.fiap.teste;


import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.LocacaoDAO;
import br.com.fiap.dao.impl.LocacaoDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;
import br.com.fiap.entity.Imovel;
import br.com.fiap.entity.Locacao;
import br.com.fiap.entity.LocacaoPK;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class TesteCadastro {
	private static LocacaoDAO dao;
	
	
	@BeforeAll
	public static void init() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new LocacaoDAOImpl(em);
	}

	@Test
	void cadastrar() {
		Cliente cli = new Cliente(1, "jOAO", Genero.MASCULINO, new GregorianCalendar(12,Calendar.JANUARY,24));
	//	Imovel imovel = new Imovel (Imovel, logradouro, cep);
	//	Locacao locacao = new Locacao(locacao, imovel, cliente, data, valor);
		
		
	}
	
}
