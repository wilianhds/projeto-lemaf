package br.com.projeto.zetta.models;

import javax.persistence.*;

@Entity
@Table(schema = "projeto", name = "perfil")
public class Perfil {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;

    public Perfil() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
