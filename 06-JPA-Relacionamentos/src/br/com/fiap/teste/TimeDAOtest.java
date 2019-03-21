package br.com.fiap.teste;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import br.com.fiap.singleton.EntityManagerFactorySingleton;
import br.com.hick.dao.TecnicoDAO;
import br.com.hick.dao.TimeDAO;
import br.com.hick.dao.impl.TecnicoDAOImpl;
import br.com.hick.dao.impl.TimeDAOImpl;
import br.com.hick.entity.Jogador;
import br.com.hick.entity.Posicao;
import br.com.hick.entity.Tecnico;
import br.com.hick.entity.Time;

class TimeDAOtest {

	private static TimeDAO timeDao;
	private static TecnicoDAO tecnicoDao;
	
	private Time time;
	private Tecnico tecnico;
	
	
	
	@BeforeAll //método que executa antes todos os testes
	public static void inicializar() {
		EntityManager em = EntityManagerFactorySingleton
							.getInstance().createEntityManager();
		timeDao = new TimeDAOImpl(em);
		tecnicoDao = new TecnicoDAOImpl(em);
	}
	
	
	
	@BeforeEach //método executado antes de cada teste
	public void cadastrarAntesDosTestes() {
		//Cadastrar um time e um tecnico
		//Instanciar um time e um tecnico com o time 
		
		
		time = new Time(null, "FIAP LOL", 1);
		tecnico = new Tecnico(time, "Rafa", 
			new GregorianCalendar(1990, Calendar.JANUARY, 5));
		
		Jogador j1 = new Jogador();
		j1.setNome("Henrique");
		j1.setPosicao(Posicao.ADC);
		
		Jogador j2 = new Jogador();
		j2.setNome("Eros");
		j2.setPosicao(Posicao.TOP);
		
		Jogador j3 = new Jogador();
		j3.setNome("Rodrigo Gamer");
		j3.setPosicao(Posicao.SUP);
		
		time.AdcJogador(j1);
		time.AdcJogador(j2);
		time.AdcJogador(j3);
		
		
		//Cadastrar o tecnico e o time
		try {
			//timeDao.create(time);
			tecnicoDao.create(tecnico); 
			tecnicoDao.commit();
		}catch(Exception e) {
			e.printStackTrace();
			fail("Errouuuu");
		}
	}
	
	
	
	
	@Test
	void readTest() {
		//Pesquisar o tecnico pelo ID
		try {
			Tecnico busca = tecnicoDao.read(tecnico.getCodigo());
			
			assertNotNull(busca);
			assertNotNull(busca.getTime());
			
		} catch(Exception e) {
			e.printStackTrace();
			fail("Errouuuu");
		}
	}
	
	
	@Test
	void createTest() {
		assertNotEquals(0, time.getCodigo());
		assertNotEquals(0, tecnico.getCodigo());
	}

}
