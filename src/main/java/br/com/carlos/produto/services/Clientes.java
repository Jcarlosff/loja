package br.com.carlos.produto.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.carlos.produto.model.Cliente;



@Repository
public class Clientes {
	
	private static final List<Cliente> LISTA_CLIENTES = new ArrayList<>();

	static {
		LISTA_CLIENTES.add(new Cliente("Pedro", "222.555.666-99", "10/02/1999","Masc" ));
		LISTA_CLIENTES.add(new Cliente("Maria",  "222.255.676-99", "10/03/1985","Fem" ));
		LISTA_CLIENTES.add(new Cliente("Jose",  "211.555.886-79", "05/06/1988","Masc"));
	}

	public List<Cliente> todos() {
		return Clientes.LISTA_CLIENTES;
	}

	public void adicionar(Cliente cliente) {
		Clientes.LISTA_CLIENTES.add(cliente);
	}

}