package br.com.projeto.zetta.repository;

import br.com.projeto.zetta.models.Cargo;
import br.com.projeto.zetta.models.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    Perfil findByNome(String nome);
    List<Perfil> findAllByOrderByNome();
}
