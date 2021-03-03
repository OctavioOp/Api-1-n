package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.models.Empresas;
import com.company.repositories.EmpresaRepository;

@Service
public class EmpresasServiceImpl implements EmpresasService{
	
	@Autowired
	EmpresaRepository er;

	@Override
	public List<Empresas> listEmpresas() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Empresas saveEmpresas(Empresas empresas) {
		// TODO Auto-generated method stub
		if(empresas != null) {
			return er.save(empresas);
		}
		return new Empresas();
	}

	@Override
	public void deleteEmpresas(Integer id) {
		// TODO Auto-generated method stub
		if(er.existsById(id)) {
			er.deleteById(id);
		}
	}

	@Override
	public void updateEmpresas(Empresas empresas) {
		// TODO Auto-generated method stub
		Integer id = empresas.getIdEmpresa();
		if(er.existsById(id)) {
		Empresas update = new Empresas();
		update.setIdEmpresa(empresas.getIdEmpresa());
		update.setNombre(empresas.getNombre());
		update.setFundacion(empresas.getFundacion());
		update.setListJuegos(empresas.getListJuegos());
		
		er.save(update);
		}
		
	}
	


}
