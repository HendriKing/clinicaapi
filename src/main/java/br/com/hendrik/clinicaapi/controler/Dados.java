package br.com.hendrik.clinicaapi.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hendrik.clinicaapi.model.Cliente;

/*
 * Em nosso projeto iremos utilizar algumas anotações (Annotations) que 
 * são elementos de tipificação de código, ou seja, são tipificações que
 * fazemos no código para informar que aquela linha ou grupo de comando
 * deve fazer e como deve ser entendido.
 * No caso abaixo, estamos dizendo que nossa classe Dados é um controlador
 * de fluxo que receberá em Rest e Responderá dados em formato Rest.
 */


@RestController
@RequestMapping
public class Dados {

	@GetMapping
	public String incial() {
		return "Olá, você está na página inicial do projeto";
	}
	
	@GetMapping("/cliente")
	public String cliente() {
		return "Ednaldo Pereira";
	}
	@GetMapping("/clientes")
	public List<Cliente> clientes() {
		List<Cliente> lst = new ArrayList<Cliente>();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.setNome("Daireb");
		c2.setNome("Madao");
		
		lst.add(c1);
		lst.add(c2);
		
		return lst;
	}
	@PostMapping
	public String cadastro() {
		return "Cadastro Inicializado";
	}
	
	@PutMapping("/atualizar")
	public String atualizar() {
		return "Dados Atualizados";
	}
	
	@DeleteMapping("/apagar")
	public String apagar() {
		return " Dados apagados";
	}
	
}


