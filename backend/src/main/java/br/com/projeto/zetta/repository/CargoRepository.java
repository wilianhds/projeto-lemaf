package br.com.projeto.zetta.repository;

import br.com.projeto.zetta.models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
    Cargo findByNome(String nome);
}
