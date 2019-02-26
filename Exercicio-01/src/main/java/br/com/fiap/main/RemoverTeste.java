package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.MotoristaDAO;
import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.impl.MotoristaDAOImpl;
import br.com.fiap.dao.impl.VeiculoDAOImpl;
import br.com.fiap.excecao.Error404;

public class RemoverTeste {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();

		MotoristaDAO mdao = new MotoristaDAOImpl(em);
		VeiculoDAO vdao = new VeiculoDAOImpl(em);

		try {
			mdao.deletar(1);
			vdao.deletar(1);
			mdao.commit();
			vdao.commit();
		} catch (Error404 e) { // estou chamando a excecao pois caso não exista codigo 1, ele ira dar a excecao not found
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

		em.close();
		fabrica.close();

	}
}
