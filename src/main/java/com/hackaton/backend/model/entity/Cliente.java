package com.hackaton.backend.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hackaton.backend.config.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "cliente")
@Data
public class Cliente extends AbstractEntity {

	@Column(name = "nome", nullable = false, length = 150)
	@NotEmpty(message = "{campo.nome.obrigatorio}")
	private String nome;

	@Column(name = "senha", nullable = false, length = 150)
	@NotEmpty(message = "{campo.nome.obrigatorio}")
	private String senha;

	@Column(name = "email", nullable = false, length = 150, unique = true)
	@NotEmpty(message = "{campo.nome.obrigatorio}")
	private String email;

	@Column(name = "telefone", nullable = false, length = 11)
	@NotEmpty(message = "{campo.nome.obrigatorio}")
	private String telefone;

	@Column(name = "data_cadastro", updatable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCadastro;
}
	
	
