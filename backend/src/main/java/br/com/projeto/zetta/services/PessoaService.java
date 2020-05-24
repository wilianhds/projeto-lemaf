package br.com.projeto.zetta.services;

import br.com.projeto.zetta.auxiliar.UsuarioAuxiliar;
import br.com.projeto.zetta.models.Pessoa;
import br.com.projeto.zetta.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa findByCpf(String cpf) {

        return this.repository.findByCpf(cpf);
    }

}
