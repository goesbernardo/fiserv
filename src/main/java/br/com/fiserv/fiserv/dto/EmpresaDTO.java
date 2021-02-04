package br.com.fiserv.fiserv.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaDTO {

    @Length(min = 5,max = 100, message = "o nome deve conter entre 5 a 100 caracteres")
    @NotBlank(message = "nome é obrigatório")
    @NotEmpty
    private String nome;

    @CNPJ
    @NotBlank(message = "CNPJ é obrigatório")
    @NotEmpty
    private String cnpj;

}
