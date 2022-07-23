package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;
	@RestController
public class ClienteController {
	@GetMapping("/clientes")
	public List<Cliente>listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("34 9999-111111");
		cliente1.setEmail("joao@gmail.com");
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("34 8888-111111");
		cliente2.setEmail("maria@gmail.com");
		var cliente3 = new Cliente();
		cliente3.setId(3L);
		cliente3.setNome("Vilma");
		cliente3.setTelefone("34 7777-111111");
		cliente3.setEmail("vilma@gmail.com");
		return Arrays.asList(cliente1, cliente2, cliente3);
	}
}
 