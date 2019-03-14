package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_MOTORISTA")
public class Motorista {
	@Id
	@Column(name="nr_carteira", nullable= false)
	private int carteira;
	
	@Column(name="nm_motorista", nullable = false)
	private String nome;
	
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;
	
	@Lob
	@Column(name="fl_carteira")
	private byte[] foto;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero")
	private Genero genero;


	
	
	
	public Motorista() {
		super();
	}


	public Motorista(String nome, Calendar nascimento, byte[] foto, Genero genero) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.foto = foto;
		this.genero = genero;
	}


	public Motorista(int carteira, String nome, Calendar nascimento, byte[] foto, Genero genero) {
		super();
		this.carteira = carteira;
		this.nome = nome;
		this.nascimento = nascimento;
		this.foto = foto;
		this.genero = genero;
	}


	public int getCarteira() {
		return carteira;
	}


	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Calendar getNascimento() {
		return nascimento;
	}


	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}


	public byte[] getFoto() {
		return foto;
	}


	public void setFoto(byte[] foto) {
		this.foto = foto;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
}