package br.com.carlos.produto.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.carlos.produto.model.Cliente;


public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
