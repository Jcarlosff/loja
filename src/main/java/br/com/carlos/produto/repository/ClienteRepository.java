package br.com.carlos.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlos.produto.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
