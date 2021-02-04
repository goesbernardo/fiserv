package br.com.fiserv.fiserv.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "EMPRESA")
@Data
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(min = 5,max = 100, message = "o nome deve conter entre 5 a 100 caracteres")
    @NotBlank(message = "nome é obrigatório")
    @NotEmpty
    private String nome;

    @CNPJ
    @NotBlank(message = "CNPJ é obrigatório")
    @NotEmpty
    @Column(unique = true)
    private String cnpj;


}
