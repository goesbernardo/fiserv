package br.com.fiserv.fiserv.mapper;

import br.com.fiserv.fiserv.dto.EmpresaDTO;
import br.com.fiserv.fiserv.model.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmpresaMapper {


    EmpresaMapper INSTANCE = Mappers.getMapper(EmpresaMapper.class);


    @Mappings(
            value = {
                    @Mapping(source = "nome", target = "nome"),
                    @Mapping(source = "cnpj", target = "cnpj")
            }
    )
    Empresa toModel(EmpresaDTO empresaDTO);

    @Mappings(
            value = {
                    @Mapping(source = "nome", target = "nome"),
                    @Mapping(source = "cnpj", target = "cnpj")
            }
    )
    EmpresaDTO toDTO(Empresa empresa);


}
