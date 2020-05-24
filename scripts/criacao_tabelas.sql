CREATE TABLE projeto.pessoa (
	id serial NOT NULL,
	nome varchar(256) NOT NULL,
	cpf varchar(256) NOT NULL,
	data_nascimento timestamp NULL,
	sexo char(1) NOT NULL,
	CONSTRAINT pessoa_id PRIMARY KEY (id),
	CONSTRAINT pessoa_un UNIQUE (id)
);

CREATE TABLE projeto.cargo (
	id serial NOT NULL,
	nome varchar(256) NOT NULL,
    CONSTRAINT cargo_id PRIMARY KEY (id)
	CONSTRAINT cargo_un UNIQUE (nome)
);

CREATE TABLE projeto.perfil (
	id serial NOT NULL,
	nome varchar(256) NOT NULL,
    CONSTRAINT perfil_id PRIMARY KEY (id),
	CONSTRAINT perfil_nome UNIQUE (nome)
);

CREATE TABLE projeto.usuario (
	id serial NOT NULL,
	id_pessoa integer NOT NULL,
    id_cargo integer NOT NULL,
	data_cadastro timestamp NOT NULL,
	CONSTRAINT usuario_id PRIMARY KEY (id),
	CONSTRAINT usuario_pessoa FOREIGN KEY (id) REFERENCES projeto.pessoa(id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT usuario_cargo FOREIGN KEY (id) REFERENCES projeto.cargo(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE projeto.perfil_usuario (
	id_usuario integer NOT NULL,
	id_perfil integer NOT NULL,
	CONSTRAINT perfil_usuario_pk PRIMARY KEY (id_usuario,id_perfil),
	CONSTRAINT perfil_usuario_fk FOREIGN KEY (id_usuario) REFERENCES projeto.usuario(id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT perfil_usuario_fk_1 FOREIGN KEY (id_perfil) REFERENCES projeto.perfil(id) ON DELETE CASCADE ON UPDATE CASCADE
);
