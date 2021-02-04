package br.com.fiserv.fiserv.controller;

import br.com.fiserv.fiserv.dto.EmpresaDTO;
import br.com.fiserv.fiserv.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/fiserv")
public class EmpresaController {



    @Autowired
    EmpresaService empresaService;

    /*@GetMapping("/{id}")
    public Empresa findById(@PathVariable(value = "id") Long id) throws ResponseStatusException {

       return empresaRepository.findById(id).orElseThrow(()->
                new ResponseStatusException(HttpStatus.NOT_FOUND));
    }*/

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmpresaDTO create(@RequestBody @Valid EmpresaDTO empresaDTO) {
        return empresaService.create(empresaDTO);
    }



}
