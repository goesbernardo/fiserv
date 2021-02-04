package br.com.fiserv.fiserv.configuration;

import br.com.fiserv.fiserv.dto.EmpresaDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("fiserv")
public interface EmpresaControllerDoc {

    @ApiOperation(value = "empresa criada")
    @ApiResponses(value = {
            @ApiResponse(code = 201,message = "success empresa created"),
            @ApiResponse(code = 400,message = "empresa error")
    })
    EmpresaDTO create(EmpresaDTO empresaDTO);
}
