package br.com.hick.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_CAMPEONATO")
@SequenceGenerator(name= "camp", sequenceName = "SQ_T_CAMPEONATO",allocationSize = 1)
public class Campeonato {
	
	
	@Id
	@GeneratedValue(generator="camp",strategy=GenerationType.SEQUENCE)
	@Column(name = "cd_campeonato", nullable = false)
	private int codigo;
	
	@Column(name = "nm_campeonato", nullable = false)
	private String nome;
	
	@Column(name = "vl_premiacao", nullable = false)
	private double premiacao;

}
