package com.company.controller;

import java.util.List;

import com.company.models.Juegos;

public interface juegosInterface {
	
	public List<Juegos> gameList();
	public Juegos newGame(Juegos juegos);
	public void deleteGame(Integer id);
	public void updateGame(Juegos juegos);

}
