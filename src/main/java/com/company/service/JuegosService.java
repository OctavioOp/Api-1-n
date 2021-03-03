package com.company.service;

import java.util.List;

import com.company.models.Juegos;

public interface JuegosService {
	
	public List<Juegos> listJuegos();
	public Juegos saveJuegos(Juegos juegos);
	public void deleteJuegos(Integer id);
	public void updateJuegos(Juegos juegos);

}
