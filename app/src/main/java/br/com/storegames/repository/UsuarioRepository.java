package br.com.storegames.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.storegames.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByUsuario(String usuario);
}

