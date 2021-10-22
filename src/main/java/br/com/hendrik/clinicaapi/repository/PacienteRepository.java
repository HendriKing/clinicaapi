package br.com.hendrik.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hendrik.clinicaapi.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{


}
