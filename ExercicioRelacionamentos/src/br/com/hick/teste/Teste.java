package br.com.hick.teste;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import br.com.fiap.entity.Caso;
import br.com.fiap.entity.Item;
import br.com.fiap.entity.Sistema;
import br.com.fiap.entity.Usuario;
import br.com.fiap.singleton.EntityManagerFactorySingleton;
import br.com.hick.dao.UsuarioDAO;
import br.com.hick.dao.impl.UsuarioDAOImpl;

class Teste {

	@Test
	void test() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		UsuarioDAO dao = new UsuarioDAOImpl(em);
		
		Usuario usuario = new Usuario();
		
		usuario.setNome("Barcelos");
		
		Item item = new Item();
		item.setDescricao("Teste de stress");
		
		Caso caso = new Caso();
		caso.setNome("Caso de cadastro de usuario");
		
		Sistema sistema = new Sistema();
		sistema.setNome("Sistema Teste");
		
		List<Item> itens = new ArrayList<>();
		itens.add(item);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario);
		item.setUsuarios(usuarios);
		
		item.setCaso(caso);
		
		caso.setSistema(sistema);
		
		try {
			dao.create(usuario);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			fail("falhou");
		}
	}}

