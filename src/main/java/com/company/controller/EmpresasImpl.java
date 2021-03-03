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

import com.company.models.Empresas;
import com.company.service.EmpresasService;

@RestController
@RequestMapping("empresas/v1/api")
public class EmpresasImpl implements EmpresasInterface{

	@Autowired
	EmpresasService es;
	
	@Override
	@GetMapping("/list")
	@ResponseStatus(HttpStatus.OK)
	public List<Empresas> companyList() {
		// TODO Auto-generated method stub
		return es.listEmpresas();
	}

	@Override
	@PostMapping("/new")
	@ResponseStatus(HttpStatus.CREATED)
	public Empresas newCompany(@RequestBody Empresas empresas) {
		// TODO Auto-generated method stub
		return es.saveEmpresas(empresas);
	}

	@Override
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteCompany(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		es.deleteEmpresas(id);
	}

	@Override
	@PutMapping("/update")
	@ResponseStatus(HttpStatus.OK)
	public void updateCompany(@RequestBody Empresas empresas) {
		// TODO Auto-generated method stub
		es.updateEmpresas(empresas);
	}

}
