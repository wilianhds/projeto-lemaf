package br.com.projeto.zetta.services;

import br.com.projeto.zetta.auxiliar.CargoAuxiliar;
import br.com.projeto.zetta.models.Cargo;
import br.com.projeto.zetta.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    private CargoRepository repository;

    public Cargo salvarCargo(String nomeCargo){
        Cargo cargo = repository.findByNome(nomeCargo);
        if(cargo != null) {
            return cargo;
        }
        cargo = new Cargo();
        cargo.setNome(nomeCargo);
        this.repository.save(cargo);
        return cargo;
    }

    public Cargo editCargo(CargoAuxiliar novoCargo) {
        Cargo cargo = repository.findByNome(novoCargo.nomeAntigo);
        if(cargo != null) {
            cargo.setNome(novoCargo.nomeNovo);
            repository.save(cargo);
        }
        return cargo;
    }

    public List<Cargo> listarTodos() {
        return repository.findAllByOrderByNome();
    }
}
