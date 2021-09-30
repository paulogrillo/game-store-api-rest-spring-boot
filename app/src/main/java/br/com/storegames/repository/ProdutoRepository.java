package br.com.storegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.storegames.models.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByDescricaoContainingIgnoreCase( String nome);
}
