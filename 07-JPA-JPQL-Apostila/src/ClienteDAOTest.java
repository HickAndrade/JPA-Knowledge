import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

class ClienteDAOTest {

	private static ClienteDAO dao;

	@BeforeAll
	public static void instanciar() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new ClienteDAOImpl(em);
		

	}
	@Test
	void ListaClientes() {
		List<Cliente> cli = dao.Clientes();
		assertNotEquals(0, cli.size());
	}

	
	@Test
	void BuscarPorNome() {
		List<Cliente> cli = dao.RetornarPorNome("Th");System.out.println(cli);
		assertEquals(1, cli.size());
	}
	
	@Test
	void buscar() {
		List<Cliente> lista = dao.Buscar("Leandro", "Lon");
		
		for (Cliente cliente : lista) {
			assertTrue(cliente.getNome().contains("Leandro") 
					&& cliente.getEndereco().getCidade().getNome().contains("Lon"));
		}
		
	}
	
	void BuscarPorEstados() {
		List<String> estados = new ArrayList<>();
		List<Cliente> lista = dao.BuscarPorEstados(estados);
		
		for (Cliente cliente : lista) {
			assertTrue(estados.contains(cliente.getEndereco().getCidade().getUf()));
				 
		}
		
	}
}
