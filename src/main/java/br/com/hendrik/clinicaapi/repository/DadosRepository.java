package br.com.hendrik.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hendrik.clinicaapi.model.Cliente;

public interface DadosRepository extends JpaRepository<Cliente, Long> {

}
