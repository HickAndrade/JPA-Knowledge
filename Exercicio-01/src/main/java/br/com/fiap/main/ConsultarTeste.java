package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.impl.MotoristaDAOImpl;
import br.com.fiap.dao.impl.VeiculoDAOImpl;
import br.com.fiap.entity.Motorista;
import br.com.fiap.entity.Veiculo;

public class ConsultarTeste {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();

		VeiculoDAO vdao = new VeiculoDAOImpl(em);
		MotoristaDAOImpl mdao = new MotoristaDAOImpl(em);

		Veiculo veiculo = vdao.consultar(1);
		Motorista motorista = mdao.Consultar(1);

		System.out.println(veiculo.getCor());
		System.out.println(motorista.getNome());

		em.close();
		fabrica.close();

	}

}
