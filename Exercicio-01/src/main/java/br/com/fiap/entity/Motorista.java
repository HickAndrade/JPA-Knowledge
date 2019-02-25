package br.com.fiap.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_MOTORISTA")
public class Motorista {
	
	@Id
	private int carteira;
	
	
	private String nome;
	private Date nascimento;
	private byte[] carteiraFoto;
	private Genero genero;
	
	
	
}
