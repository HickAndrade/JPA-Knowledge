package br.com.fiap.teste;

import java.util.Calendar;
import java.util.Date;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Tipo;
import br.com.fiap.entity.Zoologico;

public class CadastroTeste {
public static void main(String[] args) {
	//Criar um gerenciador de entidades(Enity Manager)
	//Primeiro riar a fabrica de entity manager
	
	//PERSISTENCE.XML
			
		

	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	EntityManager em = fabrica.createEntityManager();
	
	
	//Cadastrar um Zoo
	
	
	
	Zoologico zoo = new Zoologico( "ZooSP", 50, Tipo.Terrestre, new Date(), new Date(), Calendar.getInstance(), false, null);
	
	
	
	em.persist(zoo);
	em.getTransaction().begin();
	em.getTransaction().commit();
	
	em.close();
	fabrica.close();
}

}
