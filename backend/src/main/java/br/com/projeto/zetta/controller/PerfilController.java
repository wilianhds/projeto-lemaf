package br.com.projeto.zetta.controller;

import br.com.projeto.zetta.auxiliar.PerfilAuxiliar;
import br.com.projeto.zetta.models.Cargo;
import br.com.projeto.zetta.models.Perfil;
import br.com.projeto.zetta.services.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PerfilController {

    @Autowired
    private PerfilService service;

    @RequestMapping(value = "/perfil/salvar", method = RequestMethod.POST)
    public Perfil savePerfil(@RequestBody String nome){
        Perfil perfil = service.salvarPerfil(nome);
        return perfil;
    }

    @RequestMapping(value = "/perfil/editar", method = RequestMethod.POST)
    public Perfil savePerfil(@RequestBody PerfilAuxiliar perfilAuxiliar){
        Perfil perfil = service.editPerfil(perfilAuxiliar);
        return perfil;
    }

    @RequestMapping(value = "/perfil/listar", method = RequestMethod.GET)
    public List<Perfil> listar(){
        List<Perfil> perfils = service.listarTodos();
        return perfils;
    }
}
