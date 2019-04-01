package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_CASO_TESTE")
@SequenceGenerator(name = "caso", sequenceName = "SQ_T_CASO", allocationSize = 1)
public class Caso {

	@Id
	@Column(name = "COD_CASO_TESTE", nullable = false)
	@GeneratedValue(generator = "caso", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "NOM_CASO_TESTE")
	private String nome;

	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "COD_SISTEMA")
	private Sistema sistema;
	
	
	@OneToMany(mappedBy = "caso")
	private List<Item> itens;
	
	
	@Column(name = "DES_CASO_TESTE", length = 40)
	private String descricao;

	public Caso(int codigo, String nome, String descricao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Caso(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public Caso() {
		super();
	}

	
	
	
	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
