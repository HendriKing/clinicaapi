package br.com.hendrik.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hendrik.clinicaapi.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{


}
