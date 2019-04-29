package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity(name = "T_PACIENTE")
@SequenceGenerator(name = "paciente", allocationSize = 1,sequenceName = "SQ_T_PACIENTE")
public class Paciente {

	
	@Id
	@GeneratedValue(generator ="paciente",strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_paciente")
	private int codigo;
	
	@Column(name = "nm_paciente")
	private String nome;
	
	@Column(name = "ds_endereco")
	private String endereco;
	
	
}
