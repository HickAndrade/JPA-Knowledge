package br.com.fiap.entity;

import java.util.Calendar;

import javax.annotation.Generated;
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



@Entity
@Table(name="T_CLIENTE")
@SequenceGenerator(name = "Cliente",sequenceName="SQ_T_CLIENTE",allocationSize=1)
public class Customer {
	@Id
	@Column(name="CD_ID")
	@GeneratedValue(generator="Cliente",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="NM_CLIENTE", nullable= false)
	private String name;
	
	@Column(name="DT_ANIVERSARIO")
	@Temporal(value = TemporalType.DATE)
	private Calendar  birthdayDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_GENERO")
	private Gender gender;
	
	@Lob
	@Column(name="FL_PERFIL")
	private byte[] perfilImage;


	public Customer() {
		super();
	}
	
	

	public Customer(String name, Calendar birthdayDate, Gender gender, byte[] perfilImage) {
		super();
		this.name = name;
		this.birthdayDate = birthdayDate;
		this.gender = gender;
		this.perfilImage = perfilImage;
	}



	public Customer(int id, String name, Calendar birthdayDate, Gender gender, byte[] perfilImage) {
		super();
		this.id = id;
		this.name = name;
		this.birthdayDate = birthdayDate;
		this.gender = gender;
		this.perfilImage = perfilImage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(Calendar birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public byte[] getPerfilImage() {
		return perfilImage;
	}

	public void setPerfilImage(byte[] perfilImage) {
		this.perfilImage = perfilImage;
	}
	
	
	
	
}
