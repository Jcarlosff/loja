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

import br.com.carlos.produto.model.Produto;
import br.com.carlos.produto.repository.ProdutoRepository;


@Controller
public class ProdutosController {
	@Autowired
	private ProdutoRepository produtor;
	
	@RequestMapping("/produtos")
	public String listar(Model model) {
		
		List<Produto> todosProdutoss = produtor.findAll();
		model.addAttribute("produtos", todosProdutoss);
		
		return "produtos";
	}
	
	@RequestMapping(value = "/produtos", method = RequestMethod.POST)
	public String salvar(@Validated Produto produto, Errors errors) {
		
		if ( errors.hasErrors() ) {
			return "redirect:/produtos";
		}
		
		this.produtor.save(produto);
		
		return "redirect:/produto";
	}
	
	@RequestMapping("/excluiproduto/{id}")
	public String excluir(@PathVariable Long id) {
		
		this.produtor.delete(id);
		
		return "redirect:/produtos";
	}
	
	@RequestMapping("/editaproduto/{produto}")
	public ModelAndView editar(@PathVariable Produto produto) {
		
		ModelAndView mv = new ModelAndView("EditaProduto");
		
		mv.addObject(produto);
		
		return mv;
	}
	
	@RequestMapping("/alteracidade")
	public String editaralterar(@Validated Produto produto) {
		
		Produto produtonovo = produto;

		this.produtor.delete(produto.getId());

		this.produtor.save(produtonovo);

		return "redirect:/produtos";
	}
}
