package br.com.carlos.produto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.carlos.produto.model.Cliente;
import br.com.carlos.produto.repository.ClienteRepository;

@Controller
public class ClientesController {
	@Autowired
	private ClienteRepository clienter;

	@RequestMapping("/clientes")
	public String cliente(Model model) {
		model.addAttribute("cliente", new Cliente());

		return "clientes";
	}

	@RequestMapping(path = "/clientes",method = RequestMethod.POST)
	public String gravaCliente(Cliente  cliente, Model model ) {
		clienter.save(cliente);
		model.addAttribute("clientes", clienter.findAll());
		return "clientes";

	}

}