package br.com.carlos.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlos.produto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
