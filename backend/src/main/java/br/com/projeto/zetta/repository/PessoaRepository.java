package br.com.projeto.zetta.repository;

import br.com.projeto.zetta.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    public Pessoa findByCpf(String cpf);

}
