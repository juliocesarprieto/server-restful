package br.com.sgps.serverSgps.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.sgps.serverSgps.models.Clientes;
import br.com.sgps.serverSgps.repositories.ClienteRepository;

@RestController
@RequestMapping(path = "/api/clientes")
public class ClientesService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping(produces = "application/json")
	public @ResponseBody List<Clientes> findAllClientes(){		
		List<Clientes> clientes = clienteRepository.findAll();
		return clientes;
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(consumes = "application/json")
	public ResponseEntity<Void> insertCliente(@RequestBody Clientes cliente){		
		clienteRepository.save(cliente);		
		return ResponseEntity.ok().build();
	}

}
