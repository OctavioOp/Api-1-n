package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.models.Juegos;
import com.company.repositories.JuegosRepository;
@Service
public class JuegosServiceImpl implements JuegosService{
	
	@Autowired
	JuegosRepository jr;

	@Override
	public List<Juegos> listJuegos() {
		// TODO Auto-generated method stub
		return jr.findAll();
	}

	@Override
	public Juegos saveJuegos(Juegos juegos) {
		// TODO Auto-generated method stub
		if(juegos != null)
		{
			return jr.save(juegos);
		}
		return new Juegos();
	}

	@Override
	public void deleteJuegos(Integer id) {
		// TODO Auto-generated method stub
		if(jr.existsById(id)) {
			jr.deleteById(id);
		}
	}

	@Override
	public void updateJuegos(Juegos juegos) {
		// TODO Auto-generated method stub
		Integer id = juegos.getIdJuego();
		if(jr.existsById(id)) {
			Juegos update = new Juegos();
			update.setIdJuego(juegos.getIdJuego());
			update.setTitulo(juegos.getTitulo());
			update.setTipo(juegos.getTipo());
			update.setEmpresas(juegos.getEmpresas());
			update.setFechaSalida(juegos.getFechaSalida());
			
			jr.save(update);
		}
	}

}
