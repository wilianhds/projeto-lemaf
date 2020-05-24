package br.com.projeto.zetta.services;


import br.com.projeto.zetta.auxiliar.PerfilAuxiliar;
import br.com.projeto.zetta.models.Cargo;
import br.com.projeto.zetta.models.Perfil;
import br.com.projeto.zetta.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository repository;

    public Perfil salvarPerfil(String nomePerfil){
        Perfil perfil = repository.findByNome(nomePerfil);
        if(perfil != null) {
            return perfil;
        }
        perfil = new Perfil();
        perfil.setNome(nomePerfil);
        this.repository.save(perfil);
        return perfil;
    }

    public Perfil editPerfil(PerfilAuxiliar novoPerfil) {
        Perfil perfil = repository.findByNome(novoPerfil.nomeAntigo);
        if(perfil != null) {
            perfil.setNome(novoPerfil.nomeNovo);
            repository.save(perfil);
        }
        return perfil;
    }

    public List<Perfil> listarTodos() {

        return repository.findAllByOrderByNome();

    }

}
