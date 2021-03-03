package com.company.controller;

import java.util.List;

import com.company.models.Empresas;

public interface EmpresasInterface {

	public List<Empresas> companyList();
	public Empresas newCompany(Empresas empresas);
	public void deleteCompany(Integer id);
	public void updateCompany(Empresas empresas);
}
