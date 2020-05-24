package br.com.projeto.zetta.models;

import javax.persistence.*;

@Entity
@Table(schema = "projeto", name = "usuario")
public class Usuario {

    @Id
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "id_pessoa")
    @OneToOne
    private Pessoa pessoa;

    @JoinColumn(name = "id_cargo")
    @OneToOne
    private Cargo cargo;

}
