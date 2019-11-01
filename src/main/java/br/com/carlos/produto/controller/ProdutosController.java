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
import br.com.carlos.produto.model.Produto;
import br.com.carlos.produto.repository.ProdutoRepository;


@Controller
public class ProdutosController {
	@Autowired
	private ProdutoRepository produtor;
	
	
		@RequestMapping("/produtos")
		public String cliente(Model model) {
			model.addAttribute("produto", new Produto());

			return "produtos";
		}

		@RequestMapping(path = "/produtos",method = RequestMethod.POST)
		public String gravaProduto(Produto produto, Model model ) {
			produtor.save(produto);
			model.addAttribute("produtos", produtor.findAll());
			return "produtos";

		}

	}