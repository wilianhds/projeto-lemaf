package br.com.projeto.zetta.auxiliar;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class UsuarioAuxiliar {

    public String nome;

    public String cpf;

    @JsonFormat(pattern="yyyy-MM-dd")
    public Date data_nascimento;

    public char sexo;

    public String nome_cargo;

}
