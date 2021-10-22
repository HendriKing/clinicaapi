package br.com.hendrik.clinicaapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgenda;
	
	@Column
	private Long idPaciente;
	
	@Column
	private Long idMedico;
	
	@Column
	private Date dataConsulta;
	
	@Column
	private Date horaConsulta;
	
	@Column
	private String especialidade;

	public Agenda() {
	}

	public Agenda(Long idAgenda, Long idPaciente, Long idMedico, Date dataConsulta, Date horaConsulta,
			String especialidade) {
		this.idAgenda = idAgenda;
		this.idPaciente = idPaciente;
		this.idMedico = idMedico;
		this.dataConsulta = dataConsulta;
		this.horaConsulta = horaConsulta;
		this.especialidade = especialidade;
	}

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Date getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(Date horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
}
