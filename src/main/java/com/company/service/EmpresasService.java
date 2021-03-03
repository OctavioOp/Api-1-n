package com.company.service;

import java.util.List;

import com.company.models.Empresas;

public interface EmpresasService {

	public List<Empresas> listEmpresas();
	public Empresas saveEmpresas(Empresas empresas);
	public void deleteEmpresas(Integer id);
	public void updateEmpresas(Empresas empresas);
}
