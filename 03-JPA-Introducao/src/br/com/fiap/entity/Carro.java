package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@SuppressWarnings(value = { "all" })
@Table(name = "TB_CARRO") // para colocar o nome na tabela
@SequenceGenerator(name = "carro", sequenceName = "SQ_TB_CARRO", allocationSize = 1)
public class Carro {
	@Id
	@GeneratedValue(generator = "carro", strategy = GenerationType.SEQUENCE) // sequencia é usado para oracle
	private int id;

	@Column(name = "nm_carro", nullable = false, length = 50)
	private String nome;

	@Column(name = "ds_marca")
	private String marca;

	@Column(name = "ds_placa", nullable = false)
	private String placa;

	@Column(name = "nr_ano")
	private int ano;

	@Column(name = "ds_cambio")
	@Enumerated(EnumType.STRING) // grava a string da constante
	private Transmisao cambio;

	@Temporal(TemporalType.DATE) // grava somente a data no banco
	@Column(name = "dt_fabricacao", updatable = false)
	private Calendar dataFabricacao;

	@Transient // não sera uma coluna no banco de dados
	private boolean ligado;

	@Lob
	private byte[] documento;

		
	

	public Carro(int id, String nome, String marca, String placa, int ano, Transmisao cambio, byte[] documento) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.placa = placa;
		this.ano = ano;
		this.cambio = cambio;
		this.documento = documento;
	}

	public Carro(String nome, String marca, String placa, int ano, Transmisao cambio, Calendar dataFabricacao,
			byte[] documento) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.placa = placa;
		this.ano = ano;
		this.cambio = cambio;
		this.dataFabricacao = dataFabricacao;
		this.documento = documento;
	}

	public Carro() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Transmisao getCambio() {
		return cambio;
	}

	public void setCambio(Transmisao cambio) {
		this.cambio = cambio;
	}

	public Calendar getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Calendar dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public byte[] getDocumento() {
		return documento;
	}

	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	
	
}
