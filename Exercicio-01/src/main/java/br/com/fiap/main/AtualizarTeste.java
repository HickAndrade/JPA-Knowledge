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

public class AtualizarTeste {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();

		VeiculoDAO vdao = new VeiculoDAOImpl(em);
		MotoristaDAO mdao = new MotoristaDAOImpl(em);

		Veiculo veiculo = new Veiculo(1, "str-1912", "prata", 2016);
		Motorista motorista = new Motorista(1, "joao pintudo", new GregorianCalendar(1994, Calendar.FEBRUARY, 25), null,
				Genero.MASCULINO);

		try {
			vdao.atualizar(veiculo);
			mdao.Atualizar(motorista);
			vdao.commit();
			mdao.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

		em.close();
		fabrica.close();

	}
}
