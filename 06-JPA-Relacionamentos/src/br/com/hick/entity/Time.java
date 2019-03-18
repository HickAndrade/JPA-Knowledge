package br.com.hick.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "T_TIME")
@SequenceGenerator(name= "time", sequenceName = "SQ_T_TIME", allocationSize = 1)
public class Time {
	
	@Id
	@GeneratedValue(generator = "time", strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_time", nullable = false )
	private int codigo;

	@OneToOne(mappedBy="time")
	private Tecnico tecnico;
	
	@OneToMany(mappedBy = "time")
	private List<Jogador> Jogadores;
	
	@Column(name = "nm_time", nullable = false)
	private String nome;
	
	@Column(name = "nr_titulos", nullable = false)
	private int titulos;



}
