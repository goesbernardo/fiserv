package br.com.fiserv.fiserv.mapper;

import br.com.fiserv.fiserv.dto.EmpresaDTO;
import br.com.fiserv.fiserv.model.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmpresaMapper {


    EmpresaMapper INSTANCE = Mappers.getMapper(EmpresaMapper.class);

    Empresa toModel(EmpresaDTO empresaDTO);

    EmpresaDTO toDTO(Empresa empresa);


}
