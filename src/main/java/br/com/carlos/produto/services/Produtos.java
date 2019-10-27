package br.com.carlos.produto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.carlos.produto.model.Produto;
import br.com.carlos.produto.repository.ProdutoRepository;


@Controller
public class Produtos {
	@Autowired
	private ProdutoRepository produtor;
	
	public double devolveValorProduto(String produto)
	{
		List<Produto> todoProdutos = produtor.findAll();
		
		for(int i = 0 ; i < todoProdutos.size(); i++){
			
            if(produto.equals(todoProdutos.get(i).getNome()))
            {
            	return todoProdutos.get(i).getValorProduto();
            }
        }
		return 0;
	}
	
	


}
