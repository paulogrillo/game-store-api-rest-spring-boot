package br.com.storegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.storegames.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByDescricaoContainingIgnoreCase( String descricao);
}
