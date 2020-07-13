ALTER TABLE Paciente
 ADD FOREIGN KEY (idPais) REFERENCES Pais(abreviatura);

 ALTER TABLE HistoriaPaciente
	ADD FOREIGN KEY (idPaciente) REFERENCES Paciente(idPaciente);