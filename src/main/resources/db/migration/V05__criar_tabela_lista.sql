CREATE TABLE lista(
	idLista int(20) PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(50) NOT NULL,
	id_evento int NOT NULL,
	idConvidado int NOT NULL,
	idPresente int NOT NULL,
	FOREIGN KEY(id_evento) REFERENCES evento(id_evento),
	FOREIGN KEY(idConvidado) REFERENCES convidado(idConvidado),
	FOREIGN KEY(idPresente) REFERENCES presente(idPresente)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;