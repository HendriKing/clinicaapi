package br.com.hendrik.clinicaapi.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hendrik.clinicaapi.model.Agenda;
import br.com.hendrik.clinicaapi.repository.AgendaRepository;

@RestController
@RequestMapping("/agenda")
public class AgendaController {
	/*
	 * A anotação Autowired gera um objeto do
	 * AgendaRepository em tempo de execução, ou seja,
	 * no momento de rodar a aplicação. 
	 */
	@Autowired
	private AgendaRepository ag;

	@GetMapping("/listar")
	public List<Agenda> listar(){
		return ag. findAll();
}

	@GetMapping("/pesquisar/{id}")
	public Optional<Agenda> pesquisarId(@PathVariable Long id) {
		return ag.findById(id);
	}
	

	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Agenda agenda) {
		ag.save(agenda);
		return "Agendamento cadastrado com sucesso!";
	}
	
	@PutMapping("atualizar/{id}")
	public String atualizar(@RequestBody Agenda agenda,@PathVariable Long id) {
		Optional<Agenda> a = ag.findById(id);
		
		if(!a.isPresent()) {
			return "O agendamento não foi localizado!";
		}
			
		agenda.setIdAgenda(id);
		ag.save(agenda);
		return "Agendamento atualizado com sucesso!";
		
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		ag.deleteById(id);
		return "Agenda Apagada";
	}
	
}