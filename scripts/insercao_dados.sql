INSERT INTO projeto.pessoa
(nome, cpf, data_nascimento, sexo)
VALUES('Wilian H Souza', '123456789', null, 'M');

INSERT INTO projeto.perfil
(nome)
VALUES('ADMINISTRADOR');

INSERT INTO projeto.perfil
(nome)
VALUES('USUARIO');


INSERT INTO projeto.cargo
(nome)
VALUES('DSENVOLVEDOR');

INSERT INTO projeto.usuario
(id_pessoa, id_cargo)
VALUES(1, 1);

INSERT INTO projeto.perfil_usuario
(id_usuario, id_perfil)
VALUES(1, 1);

INSERT INTO projeto.perfil_usuario
(id_usuario, id_perfil)
VALUES(1, 3);