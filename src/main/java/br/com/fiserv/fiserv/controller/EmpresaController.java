package br.com.fiserv.fiserv.controller;

import br.com.fiserv.fiserv.dto.EmpresaDTO;
import br.com.fiserv.fiserv.model.Empresa;
import br.com.fiserv.fiserv.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/fiserv")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping
    public List<Empresa> findAll(){
        return empresaService.findAll();
    }

    @GetMapping("/{id}")
    public EmpresaDTO findById(@PathVariable long id){
        return empresaService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        this.empresaService.delete(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmpresaDTO create(@RequestBody @Valid EmpresaDTO empresaDTO) {
        return empresaService.create(empresaDTO);
    }



}
