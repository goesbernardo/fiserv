package br.com.fiserv.fiserv.service;

import br.com.fiserv.fiserv.dto.EmpresaDTO;
import br.com.fiserv.fiserv.mapper.EmpresaMapper;
import br.com.fiserv.fiserv.model.Empresa;
import br.com.fiserv.fiserv.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmpresaService {

    private final static EmpresaMapper empresaMapper = EmpresaMapper.INSTANCE;


    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }

    public EmpresaDTO findById(Long id) {
        Empresa findEmpresa = empresaRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return empresaMapper.toDTO(findEmpresa);
    }

    public void delete(Long id) {
        this.empresaRepository.deleteById(id);
    }

    public EmpresaDTO create(EmpresaDTO empresaDTO){

        Empresa empresaToCreate = empresaMapper.toModel(empresaDTO);
        Empresa created = empresaRepository.save(empresaToCreate);

        return empresaMapper.toDTO(created);
    }
}
