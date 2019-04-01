package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_USUAIO")
@SequenceGenerator(name = "usuario", sequenceName = "T_SQ_USUARIO", allocationSize = 1)
public class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name = "COD_USUARIO")
	private int codigo;
	
	@Column(name = "NOM_USUARIO")
	private String nome;

	@ManyToMany(mappedBy = "usuarios", cascade = {CascadeType.PERSIST})

	private List<Item> itens;
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
	}

	public Usuario() {
		super();
	}

	public Usuario(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
