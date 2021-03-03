package com.company.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.models.Empresas;

public interface EmpresaRepository extends JpaRepository<Empresas, Integer >{

}
