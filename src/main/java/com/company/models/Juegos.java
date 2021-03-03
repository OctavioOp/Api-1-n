package com.company.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Juegos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idJuego;
	private String titulo;
	private String tipo;
	private String fechaSalida;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_empresa"/*, nullable = false*/)
	@JsonIgnore
//	@JsonProperty(access = JsonProperty.Access.AUTO)
	private Empresas empresas;
	

}
