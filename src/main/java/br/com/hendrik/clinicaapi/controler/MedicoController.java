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

import br.com.hendrik.clinicaapi.model.Medico;
import br.com.hendrik.clinicaapi.repository.MedicoRepository;

@RestController
@RequestMapping("/medico")
public class MedicoController {
	/*
	 * A anotação Autowired gera um objeto do
	 * MedicoRepository em tempo de execução, ou seja,
	 * no momento de rodar a aplicação. 
	 */
	@Autowired
	private MedicoRepository mr;

	@GetMapping("/listar")
	public List<Medico> listar(){
		return mr. findAll();
}

	@GetMapping("/pesquisar/{id}")
	public Optional<Medico> pesquisarId(@PathVariable Long id) {
		return mr.findById(id);
	}
	

	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Medico medico) {
		mr.save(medico);
		return "Médico cadastrado com sucesso!";
	}
	
	@PutMapping("atualizar/{id}")
	public String atualizar(@RequestBody Medico medico,@PathVariable Long id) {
		Optional<Medico> me = mr.findById(id);
		
		if(!me.isPresent()) {
			return "O médico não foi localizado!";
		}
			
		medico.setIdMedico(id);
		mr.save(medico);
		return "Médico atualizado com sucesso!";
		
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		mr.deleteById(id);
		return "Medico Apagado";
	}
	
}