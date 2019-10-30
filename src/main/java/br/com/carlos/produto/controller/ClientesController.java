package br.com.carlos.produto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.carlos.produto.model.Cliente;
import br.com.carlos.produto.repository.ClienteRepository;

@Controller
public class ClientesController {
	@Autowired
	private ClienteRepository clienter;

	@RequestMapping("/clientes")
	public String listar(Model model) {

		List<Cliente> todosClientes = clienter.findAll();
		model.addAttribute("clientes", todosClientes);

		return "clientes";
	}

	@RequestMapping(value = "/clientes", method = RequestMethod.POST)
	public String salvar(@Validated Cliente cliente, Errors errors) {

		if (errors.hasErrors()) {
			return "redirect:/clientes";
		}

		this.clienter.save(cliente);

		return "redirect:/clientes";
	}

	@RequestMapping("/excluicliente/{id}")
	public String excluir(@PathVariable Long id) {

		this.clienter.delete(id);

		return "redirect:/clientes";
	}

	@RequestMapping("/editacliente/{cliente}")
	public ModelAndView editar(@PathVariable Cliente cliente) {

		ModelAndView mv = new ModelAndView("EditaCliente");

		mv.addObject(cliente);

		return mv;
	}

	@RequestMapping("/altercliente")
	public String editaralterar(@Validated Cliente cliente) {

		Cliente clienteNovo = cliente;

		this.clienter.delete(cliente.getId());

		this.clienter.save(clienteNovo);

		return "redirect:/clientes";
	}
}