package br.com.projeto.zetta.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "projeto", name = "perfil")
public class Perfil {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

}
