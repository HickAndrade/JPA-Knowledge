package br.com.fiap.entity;

import java.util.Calendar;

public class ConsultaPK {

	private int crm;
	private int paciente;
	private Calendar consulta;


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consulta == null) ? 0 : consulta.hashCode());
		result = prime * result + crm;
		result = prime * result + paciente;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultaPK other = (ConsultaPK) obj;
		if (consulta == null) {
			if (other.consulta != null)
				return false;
		} else if (!consulta.equals(other.consulta))
			return false;
		if (crm != other.crm)
			return false;
		if (paciente != other.paciente)
			return false;
		return true;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public int getPaciente() {
		return paciente;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}

	public Calendar getConsulta() {
		return consulta;
	}

	public void setConsulta(Calendar consulta) {
		this.consulta = consulta;
	}

	
	
}
