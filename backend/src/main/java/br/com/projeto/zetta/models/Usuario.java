package br.com.projeto.zetta.models;

import javax.persistence.*;

@Entity
@Table(schema = "projeto", name = "usuario")
public class Usuario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "id_pessoa")
    @OneToOne
    private Pessoa pessoa;

    @JoinColumn(name = "id_cargo")
    @OneToOne
    private Cargo cargo;

    public Usuario() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
