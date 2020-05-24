package br.com.projeto.zetta.controller;

import br.com.projeto.zetta.auxiliar.CargoAuxiliar;
import br.com.projeto.zetta.models.Cargo;
import br.com.projeto.zetta.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CargoController {

    @Autowired
    private CargoService service;

    @RequestMapping(value = "/cargo/salvar", method = RequestMethod.POST)
    public Cargo saveCargo(@RequestBody String nomeCargo){
        Cargo cargo = service.salvarCargo(nomeCargo);
        return cargo;
    }

    @RequestMapping(value = "/cargo/editar", method = RequestMethod.POST)
    public Cargo editCargo(@RequestBody CargoAuxiliar cargoAuxiliar){
        Cargo cargo = service.editCargo(cargoAuxiliar);
        return cargo;
    }

    @RequestMapping(value = "/cargo/listar", method = RequestMethod.GET)
    public List<Cargo> listar(){
        List<Cargo> cargos = service.listarTodos();
        return cargos;
    }
}
