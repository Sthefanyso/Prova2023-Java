package com.fatec.provajava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.provajava.entities.Empresa;

public interface EmpresaRepository extends JpaRepository <Empresa, Integer> {
    
}
