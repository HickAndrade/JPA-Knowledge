package br.com.fiap.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.MotoristaDAO;
import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.impl.MotoristaDAOImpl;
import br.com.fiap.dao.impl.VeiculoDAOImpl;
import br.com.fiap.entity.Genero;
import br.com.fiap.entity.Motorista;
import br.com.fiap.entity.Veiculo;

public class CadastrarTeste {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();

		VeiculoDAO vdao = new VeiculoDAOImpl(em);
		MotoristaDAO mdao = new MotoristaDAOImpl(em);

		Motorista motorista = new Motorista("jose", new GregorianCalendar(1995, Calendar.JANUARY, 20), null,
				Genero.MASCULINO);
		Veiculo veiculo = new Veiculo("EMP-1928", "PRETO", 2010);

		try {
			vdao.cadastrar(veiculo);
			mdao.cadastrar(motorista);
			vdao.commit();
			mdao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		em.close();
		fabrica.close();
	}
}
