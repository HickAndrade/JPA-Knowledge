package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_SISTEMA")
@SequenceGenerator(name = "sistema", sequenceName = "T_SQ_SISTEMA", allocationSize = 1)
public class Sistema {
	
	@Id
	@Column(name = "COD_SISTEMA", nullable = false)
	@GeneratedValue(generator = "name", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@OneToMany(mappedBy = "sistema", cascade = CascadeType.PERSIST)
	private List<Caso> casos;
	
	@Column(name="NOM_SISTEMA", length = 20, nullable = false)
	private String nome;
	
	public Sistema() {
		super();
	}
	
	

	public List<Caso> getCasos() {
		return casos;
	}



	public void setCasos(List<Caso> casos) {
		this.casos = casos;
	}



	public Sistema(String nome) {
		super();
		this.nome = nome;
	}



	public Sistema(int codigo, String nome) {
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
