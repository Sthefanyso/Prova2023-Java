package com.fatec.provajava.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.fatec.provajava.entities.Empresa;
import com.fatec.provajava.repositories.EmpresaRepository;

public class EmpresaService {
    
    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> getEmpresa(){
        return empresaRepository.findAll();
    }
}
