package br.com.carlos.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlos.produto.model.Venda;


public interface VendeRepository extends JpaRepository<Venda, Long>{ 

}
