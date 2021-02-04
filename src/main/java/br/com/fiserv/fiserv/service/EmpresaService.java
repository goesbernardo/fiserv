package br.com.fiserv.fiserv.service;

import br.com.fiserv.fiserv.dto.EmpresaDTO;
import br.com.fiserv.fiserv.mapper.EmpresaMapper;
import br.com.fiserv.fiserv.model.Empresa;
import br.com.fiserv.fiserv.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    private final static EmpresaMapper empresaMapper = EmpresaMapper.INSTANCE;


    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaDTO create(EmpresaDTO empresaDTO){

        Empresa empresaToCreate = empresaMapper.toModel(empresaDTO);
        Empresa created = empresaRepository.save(empresaToCreate);

        return empresaMapper.toDTO(created);
    }
}
