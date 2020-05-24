package br.com.projeto.zetta.repository;

import br.com.projeto.zetta.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
