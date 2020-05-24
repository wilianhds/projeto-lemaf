package br.com.projeto.zetta.services;

import br.com.projeto.zetta.auxiliar.UsuarioAuxiliar;
import br.com.projeto.zetta.models.Cargo;
import br.com.projeto.zetta.models.Pessoa;
import br.com.projeto.zetta.models.Usuario;
import br.com.projeto.zetta.repository.CargoRepository;
import br.com.projeto.zetta.repository.PessoaRepository;
import br.com.projeto.zetta.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private CargoRepository cargoRepository;

    public List<Usuario> findAll() {
        return this.repository.findAll();
    }

    public Usuario novoUsuario(UsuarioAuxiliar novoUsuario) {

        Pessoa pessoa = pessoaRepository.findByCpf(novoUsuario.cpf);

        if(pessoa != null) {
            return null;
        } else {
            pessoa = new Pessoa();
            pessoa.setNome(novoUsuario.nome);
            pessoa.setCpf(novoUsuario.cpf);
            pessoa.setSexo(novoUsuario.sexo);
            pessoa.setData_nascimento(novoUsuario.data_nascimento);
            pessoaRepository.save(pessoa);
        }

        Cargo cargo = cargoRepository.findByNome(novoUsuario.nome_cargo);

        if(cargo == null) {
            return null;
        }

        Usuario usuario = repository.findByPessoa(pessoa);

        if(usuario != null) {
            return usuario;
        }

        usuario = new Usuario();

        usuario.setPessoa(pessoa);
        usuario.setCargo(cargo);
        Date data_cadastro = new Date();

        usuario.setData_cadastro(data_cadastro);

        repository.save(usuario);
        return usuario;
    }
}
