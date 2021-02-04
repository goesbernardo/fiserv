package br.com.fiserv.fiserv.configuration;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpresaConfiguration {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();

    }


}
