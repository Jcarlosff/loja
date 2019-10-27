package br.com.carlos.produto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.carlos.produto.model.Venda;

@Repository

public class Vendas {
	
		
		@Autowired
		private Produtos produtos;
		
		
		
		public Venda calculaVenda(Venda venda) {
			
			
			
			return venda;		
			
		}

	
	
}

