package br.com.projeto.zetta.controller;

import br.com.projeto.zetta.models.Pessoa;
import br.com.projeto.zetta.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService service;

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public Pessoa findPessoaById(@RequestParam("cpf") String cpf) {
        Pessoa pessoa = service.findByCpf(cpf);
        return pessoa;
    }


}
