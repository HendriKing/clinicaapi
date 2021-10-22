package br.com.hendrik.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hendrik.clinicaapi.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{


}
