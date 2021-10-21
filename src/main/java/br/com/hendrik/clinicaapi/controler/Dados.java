package br.com.hendrik.clinicaapi.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hendrik.clinicaapi.model.Cliente;
import br.com.hendrik.clinicaapi.repository.DadosRepository;

/*
 * Em nosso projeto iremos utilizar algumas anotações (Annotations) que 
 * são elementos de tipificação de código, ou seja, são tipificações que
 * fazemos no código para informar que aquela linha ou grupo de comando
 * deve fazer e como deve ser entendido.
 * No caso abaixo, estamos dizendo que nossa classe Dados é um controlador
 * de fluxo que receberá em Rest e Responderá dados em formato Rest.
 */


@RestController
@RequestMapping("/")
public class Dados {
	
	@Autowired
	private DadosRepository dr;
	
	@PostMapping("/cad")
	public String cadastro(@RequestBody Cliente cliente) {
		dr.save(cliente);
		return "Cliente cadastrado com sucesso";
	}
	public List<Cliente> cliente(){
		return dr.findAll();
	}
}


