package br.com.storegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.storegames.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase( String nome);
}
