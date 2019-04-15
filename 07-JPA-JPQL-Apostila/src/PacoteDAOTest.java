import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.DATA_CONVERSION;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

class PacoteDAOTest {

	private static PacoteDAO pacoteDao;

	
	@BeforeAll
	public static void iniciar() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		pacoteDao = new PacoteDAOImpl(em);

	}
	
	
	@Test
	void buscarPorDatas() {
		Calendar inicio = new GregorianCalendar(2017, Calendar.JANUARY, 1);
		Calendar fim = new GregorianCalendar(2018, Calendar.JANUARY,1);
		
		List<Pacote> lsita = pacoteDao.BuscarPorDatas(inicio,fim);
		for (Pacote pacote : lsita) {
			assertTrue(pacote.getDataSaida().after(inicio)
					&& pacote.getDataSaida().before(fim));
		}	
	}
	
}
