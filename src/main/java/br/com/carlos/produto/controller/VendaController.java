package br.com.carlos.produto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.carlos.produto.model.Cliente;
import br.com.carlos.produto.model.Produto;
import br.com.carlos.produto.model.Venda;
import br.com.carlos.produto.repository.ClienteRepository;
import br.com.carlos.produto.repository.ProdutoRepository;
import br.com.carlos.produto.repository.VendeRepository;

@Controller
public class VendaController {

	@Autowired
	private ClienteRepository clienter;

	@Autowired
	private ProdutoRepository produtor;

	@Autowired
	private VendeRepository vender;

	
	@RequestMapping("/venda")
	public String venda(Model model) {
		model.addAttribute("venda", new Venda());

		return "venda";
	}

	@RequestMapping(path = "/venda", method = RequestMethod.POST)
	public String gravaVenda(Venda venda, Model model) {
		vender.save(venda);

		model.addAttribute("vendas", vender.findAll());
		return "mostraVendas";

	}

	
	@ModelAttribute("clientes1")
	public List<Cliente> getClientes1() {
		return clienter.findAll();
	}
	
	@ModelAttribute("produtos1")
	public List<Produto> getProdutos1() {
		return produtor.findAll();
	}
	
	@ModelAttribute("valorProduto")
	public List<Produto> getvalorProduto() {
		return produtor.findAll();
	}
	
	
}
