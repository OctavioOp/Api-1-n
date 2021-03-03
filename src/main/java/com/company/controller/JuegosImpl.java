package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.company.models.Juegos;
import com.company.service.JuegosService;

@RestController
@RequestMapping("juegos/v1/api")
public class JuegosImpl implements juegosInterface{

	@Autowired
	JuegosService js;
	
	@Override
	@GetMapping("/list")
	@ResponseStatus(HttpStatus.OK)
	public List<Juegos> gameList() {
		// TODO Auto-generated method stub
		return js.listJuegos();
	}

	@Override
	@PostMapping("/new")
	@ResponseStatus(HttpStatus.CREATED)
	public Juegos newGame(@RequestBody Juegos juegos) {
		// TODO Auto-generated method stub
		return js.saveJuegos(juegos);
	}

	@Override
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteGame(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		js.deleteJuegos(id);
	}

	@Override
	@PutMapping("/update")
	@ResponseStatus(HttpStatus.OK)
	public void updateGame(@RequestBody Juegos juegos) {
		// TODO Auto-generated method stub
		js.updateJuegos(juegos);
	}

}
